package com.example.coin_gogogo.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.adapter.Comment_Adapter;
import com.example.coin_gogogo.model.MutableLiveData_PostInfo;
import com.example.coin_gogogo.databinding.ActivityPostBinding;
import com.example.coin_gogogo.info.PostInfo;
import com.example.coin_gogogo.utility.Utility;

public class PostActivity extends AppCompatActivity {

    ActivityPostBinding binding;
    private Toolbar toolbar;
    private ActionBar actionBar;
    private PostInfo postInfo;
    private MutableLiveData_PostInfo liveData_postInfo;
    private Comment_Adapter adapter;
    private Activity activity = this;

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
               liveData_postInfo.Comment(activity,binding,postInfo);
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
                liveData_postInfo.Reset(binding,postInfo);
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

}