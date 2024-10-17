package com.example.eptown_;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 스플래시 화면에서 2초 후에 로그인으로 화면 이동
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, Login.class);
                startActivity(intent);
                //finish(); // 스플래시 화면을 종료하여 뒤로가기 버튼을 눌렀을 때 다시 돌아오지 않도록 함
            }
        }, 1000); // 2초 딜레이
    }
}

