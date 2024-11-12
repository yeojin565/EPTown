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

public class login3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);  // 시스템 바에 맞춰 화면 가장자리가 잘 보이도록 설정
        setContentView(R.layout.login3);

        // 첫 번째 EditText (우편번호 입력)와 버튼 (우편번호 확인 버튼)
        EditText zipCodeInput = findViewById(R.id.zipCodeSpaces);
        ImageButton verificationTransmit = findViewById(R.id.verificationTransmit);

        // 우편번호 버튼의 기본 이미지와 활성화된 상태 이미지
        int defaultZipCodeImageResource = R.drawable.btn_login_zip_code;
        int activeZipCodeImageResource = R.drawable.ic_login_zip_code_color;

        // 우편번호 입력란에 텍스트가 변경될 때마다 버튼의 이미지 변경
        zipCodeInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    verificationTransmit.setImageResource(activeZipCodeImageResource);  // 텍스트가 있으면 활성화된 버튼 이미지로 변경
                } else {
                    verificationTransmit.setImageResource(defaultZipCodeImageResource);  // 텍스트가 없으면 기본 버튼 이미지로 변경
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        // 나머지 EditText 글씨만 표시
        EditText addressInput = findViewById(R.id.addressSpaces);
        EditText addressDetailInput = findViewById(R.id.addressDetailSpaces);
        EditText phoneInput = findViewById(R.id.phoneNumberSpaces);
        EditText birthdayInput = findViewById(R.id.birthdayDateSpaces);
        EditText genderSelectInput = findViewById(R.id.genderSelectSpaces);
    }
}
