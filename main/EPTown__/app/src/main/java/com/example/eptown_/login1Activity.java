package com.example.eptown_;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login1);

        EditText passwordCheckInput = findViewById(R.id.passwordCheckInput);
        ImageButton btnContinueButton = findViewById(R.id.btnContinueButton);

        // 버튼의 기본 drawable 리소스를 저장
        int defaultImageResource = R.drawable.btn_login_continue; // 기본 drawable 리소스
        int activeImageResource = R.drawable.ic_login_color_continue; // 활성화 상태 drawable 리소스

        // TextWatcher 추가하여 입력 감지 및 버튼 배경 변경
        passwordCheckInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    // 비밀번호 확인 입력란에 텍스트가 있을 때 이미지 변경
                    btnContinueButton.setImageResource(activeImageResource);
                } else {
                    // 입력이 없을 때 기본 이미지로 복원
                    btnContinueButton.setImageResource(defaultImageResource);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }
}
