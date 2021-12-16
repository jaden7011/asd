package com.example.coin_gogogo.model;

import androidx.annotation.NonNull;

import com.example.coin_gogogo.info.PostInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

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

    public void Upload_Post_Store(final PostInfo postInfo, Listener_UpLoadPost listener_upLoadPost) {

        Store.collection(postInfo.getCoin())
                .document(postInfo.getDocid())
                .set(postInfo.getPostInfo())
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        listener_upLoadPost.onComplete();
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                listener_upLoadPost.onFail();
            }
        });
    }
}
