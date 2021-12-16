package com.example.coin_gogogo.model;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.coin_gogogo.info.PostInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

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

    public interface Listener_Request_Posts {
        void onComplete(ArrayList<PostInfo> newPosts);
        void onFail();
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
