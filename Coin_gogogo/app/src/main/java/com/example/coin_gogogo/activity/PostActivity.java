package com.example.coin_gogogo.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.adapter.Comment_Adapter;
import com.example.coin_gogogo.data.MutableLiveData_PostInfo;
import com.example.coin_gogogo.databinding.ActivityPostBinding;
import com.example.coin_gogogo.info.CommentInfo;
import com.example.coin_gogogo.info.PostInfo;
import com.example.coin_gogogo.model.Firebase_Model;
import com.example.coin_gogogo.utility.Utility;

import java.util.Date;
import java.util.HashMap;

public class PostActivity extends AppCompatActivity {

    ActivityPostBinding binding;
    private Toolbar toolbar;
    private ActionBar actionBar;
    private PostInfo postInfo;
    private MutableLiveData_PostInfo liveData_postInfo;
    private Comment_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_post);

        Bundle bundle = getIntent().getExtras();
        postInfo = bundle.getParcelable("postInfo");
        binding.setPostInfo(postInfo);

        liveData_postInfo = new ViewModelProvider(this).get(MutableLiveData_PostInfo.class);
        liveData_postInfo.get().observe(this, new Observer<PostInfo>() {
            @Override
            public void onChanged(PostInfo postInfo) {
                adapter.CommentInfo_DiffUtil(postInfo);
                binding.commentRecycler.smoothScrollToPosition(0);
            }
        });

        binding.AddCommentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Comment();
            }
        });

        setToolbar();
        Set_CommentRecycler();
    }

    private void Set_CommentRecycler(){
        adapter = new Comment_Adapter(this,postInfo);
        Utility utility = new Utility(this,binding.commentRecycler,adapter);
        utility.RecyclerInit("VERTICAL");
    }

    private void Comment(){
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
                liveData_postInfo.get().setValue(postInfo);
                binding.AddCommentT.setText("");
                binding.publisherCommentET.setText("");
                binding.passCommentET.setText("");
                hideKeyPad ();
                binding.postLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
            @Override
            public void onFail() {
                binding.postLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
        });

    }

    private void Reset(){
        binding.postLoadingview.loaderLyaout.setVisibility(View.VISIBLE);
        Firebase_Model.getInstance().Get_Post(postInfo.getCoin(), postInfo.getDocid(), new Firebase_Model.Listener_GetPost() {
            @Override
            public void onComplete(PostInfo postInfo) {
                liveData_postInfo.get().setValue(postInfo);
                binding.postLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
            @Override
            public void onFail() {
                binding.postLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
        });
    }

    public void setToolbar () {
        toolbar = findViewById(R.id.toolbar_post);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);//기본 제목을 없애줍니다.
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mypost_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        switch (item.getItemId()) {
            case R.id.delete:
//                PostDelete(0);
                break;
//                case R.id.scrap:
//                    Toast("스크랩되었습니다.(아직 미구현)");
//                    break;
            case R.id.autonew:
                item.setEnabled(false);
                Reset();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        item.setEnabled(true);
                    }
                }, 1500); //딜레이 타임 조절
                break;
            case android.R.id.home:
                //select back button
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void hideKeyPad () {
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(binding.AddCommentT.getWindowToken(), 0);
    }
}