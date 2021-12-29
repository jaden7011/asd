package com.example.coin_gogogo.model;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.coin_gogogo.databinding.ActivityPostBinding;
import com.example.coin_gogogo.info.CommentInfo;
import com.example.coin_gogogo.info.PostInfo;

import java.util.Date;
import java.util.HashMap;

import static android.content.Context.INPUT_METHOD_SERVICE;

public class MutableLiveData_PostInfo extends ViewModel {

    MutableLiveData<PostInfo> post;

    public MutableLiveData<PostInfo> get(){
        if(post == null){
            post = new MutableLiveData<>();
        }
        return post;
    }

    public void Comment(Activity activity,ActivityPostBinding binding,PostInfo postInfo){
        binding.postLoadingview.loaderLyaout.setVisibility(View.VISIBLE);
        Date date = new Date();

        CommentInfo commentInfo = new CommentInfo(
                binding.AddCommentT.getText().toString(),
                binding.publisherCommentET.getText().toString(),
                binding.passCommentET.getText().toString(),
                date,
                0,
                new HashMap<>(),
                date+"/"+binding.passCommentET.getText().toString());

        Firebase_Model.getInstance().Update_Comments_With_Transaction(postInfo.getCoin(), postInfo.getDocid(), commentInfo, new Firebase_Model.Listener_GetPost() {
            @Override
            public void onComplete(PostInfo postInfo) {
                post.setValue(postInfo);
                binding.AddCommentT.setText("");
                binding.publisherCommentET.setText("");
                binding.passCommentET.setText("");
                hideKeyPad (activity,binding);
                binding.postLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
            @Override
            public void onFail() {
                binding.postLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
        });
    }

    public void Reset(ActivityPostBinding binding,PostInfo postInfo){
        binding.postLoadingview.loaderLyaout.setVisibility(View.VISIBLE);
        Firebase_Model.getInstance().Get_Post(postInfo.getCoin(), postInfo.getDocid(), new Firebase_Model.Listener_GetPost() {
            @Override
            public void onComplete(PostInfo postInfo) {
                post.setValue(postInfo);
                binding.postLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
            @Override
            public void onFail() {
                binding.postLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
        });
    }

    public void hideKeyPad (Activity activity,ActivityPostBinding binding) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(binding.AddCommentT.getWindowToken(), 0);
    }

}
