package com.example.coin_gogogo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coin_gogogo.databinding.ActivityWriteBinding;
import com.example.coin_gogogo.info.PostInfo;
import com.example.coin_gogogo.model.Firebase_Model;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Date;

import static com.example.coin_gogogo.utility.Named.WRITE_RESULT;

public class WriteActivity extends AppCompatActivity {

    private long backKeyPressedTime = 0;
    ActivityWriteBinding binding;
    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private String coin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWriteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = getIntent().getExtras();
        coin = bundle.getString("coin");
        Log.d("Start WriteActivity","coin: "+ coin);

        binding.writeToolbar.postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upload();
            }
        });
    }

    public void upload(){
        binding.writeLoadingview.loaderLyaout.setVisibility(View.VISIBLE);

        final DocumentReference documentReference
                = db.collection(coin).document();

        Firebase_Model.getInstance().Upload_Post_Store(new PostInfo(
                binding.publisherET.getText().toString(),
                binding.titleEdit.getText().toString(),
                binding.contentEdit.getText().toString(),
                new Date(),
                documentReference.getId(),
                binding.passET.getText().toString(),
                coin
        ), new Firebase_Model.Listener_UpLoadPost() {
            @Override
            public void onComplete() {
                binding.writeLoadingview.loaderLyaout.setVisibility(View.GONE);
                toMain(WRITE_RESULT);
            }
            @Override
            public void onFail() {
                binding.writeLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // 마지막으로 뒤로가기 버튼을 눌렀던 시간 저장
        if (System.currentTimeMillis() > backKeyPressedTime + 1500) {
            backKeyPressedTime = System.currentTimeMillis();
            Toast("\'뒤로\' 버튼을 한번 더 누르시면 \'글쓰기\'가 종료됩니다.");
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 1500) {
            //아래 3줄은 프로세스 종료
            finish();
        }
    }

    public void toMain(int request){
        Intent intent = new Intent();
        setResult(request,intent);
        finish();
    }

    public void Toast(String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}