package com.example.coin_gogogo.model;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.coin_gogogo.info.CommentInfo;
import com.example.coin_gogogo.info.PostInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.Transaction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Firebase_Model {

    private static Firebase_Model instance;
    private final FirebaseFirestore Store = FirebaseFirestore.getInstance();

    public static Firebase_Model getInstance(){
        if(instance == null)
            instance = new Firebase_Model();
        return instance;
    }

    public interface Listener_UpLoadPost {
        void onComplete();
        void onFail();
    }

    public interface Listener_GetPost {
        void onComplete(PostInfo postInfo);
        void onFail();
    }

    public interface Listener_Request_Posts {
        void onComplete(ArrayList<PostInfo> newPosts);
        void onFail();
    }

    public void Get_Post(String coin,String dockey,Listener_GetPost listener_getPost){
        Store.collection(coin)
                .document(dockey)
                .get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                PostInfo postInfo = documentSnapshot.toObject(PostInfo.class);
                listener_getPost.onComplete(postInfo);
            }
        });
    }

    public void Update_Comments_With_Transaction(String coin,String docid, CommentInfo NewComment, Listener_GetPost completeListener) {

        DocumentReference drf = Store.collection(coin).document(docid);

        Store.runTransaction(new Transaction.Function<PostInfo>() {
            @Override
            public PostInfo apply(Transaction transaction) throws FirebaseFirestoreException {
                DocumentSnapshot snapshot = transaction.get(drf);
                //error 트랜잭션으로 넘겨주지만 1초 이내의 동시작업은 에러를 야기하는 치명적인 단점이 존재한다. (거의 동시에 두개 이상의 댓글이 올라가면 하나만 적용되는 에러 -> 하지만 둘다 success로 표기됨)

                //읽기 작업
                PostInfo postInfo = snapshot.toObject(PostInfo.class);
                ArrayList<CommentInfo> commentInfoArrayList = postInfo.getComments();
                int commentNum = postInfo.getComment();

                //쓰기작업
                commentInfoArrayList.add(NewComment);
                transaction.update(drf, "comment", commentNum + 1);
                transaction.update(drf, "comments", commentInfoArrayList);
                Log.d("zqwqw", "" + commentInfoArrayList.size());

                //마무리
                postInfo.setComment(commentNum + 1);
                postInfo.setComments(commentInfoArrayList);

                // Success
                return postInfo;
            }
        }).addOnSuccessListener(new OnSuccessListener<PostInfo>() {
            @Override
            public void onSuccess(PostInfo postInfo) {
                Log.d("Update_Comments_With_Transaction","onSuccess");
                completeListener.onComplete(postInfo);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("Update_Comments_With_Transaction","onFailure: "+e.getMessage());
                completeListener.onFail();
            }
        });

    }

    public void Request_Posts(String coin,Listener_Request_Posts listener_request_posts){

        ArrayList<PostInfo> newPosts = new ArrayList<>();

        Store.collection(coin)
                .orderBy("createdAt", Query.Direction.DESCENDING).whereLessThan("createdAt", new Date())//업스크롤 효과 (위에서부터 최신상태로)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d("가져옴", document.getId() + " => " + document.getData());
                                PostInfo postInfo = document.toObject(PostInfo.class);
                                postInfo.setDateFormate_for_layout(new SimpleDateFormat("yyyy/MM/dd hh:mm", Locale.getDefault()).format(postInfo.getCreatedAt()));
                                newPosts.add(postInfo);
                            }///////////////////////////////////////////////////////////////////////완료
                            Log.d("Request_Posts", "size: " + newPosts.size());
                            listener_request_posts.onComplete(newPosts);
                        } else {
                            Log.d("Request_Posts", "Error : ", task.getException());
                            listener_request_posts.onFail();
                        }
                    }
                });
    }

    public void Upload_Post_Store(final PostInfo postInfo, Listener_UpLoadPost listener_upLoadPost) {

        Store.collection(postInfo.getCoin())
                .document(postInfo.getDocid())
                .set(postInfo.getPostInfo())
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Log.d("upload","onComplete:");
                        listener_upLoadPost.onComplete();
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("upload","onFail:"+e.getMessage());
                listener_upLoadPost.onFail();
            }
        });
    }
}
