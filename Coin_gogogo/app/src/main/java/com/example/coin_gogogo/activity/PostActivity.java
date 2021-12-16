package com.example.coin_gogogo.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.databinding.ActivityPostBinding;
import com.example.coin_gogogo.info.PostInfo;

public class PostActivity extends AppCompatActivity {

    ActivityPostBinding binding;
    private Toolbar toolbar;
    private ActionBar actionBar;
    private PostInfo postInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_post);

        setToolbar();
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
//                Reset();
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