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

public class login2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login2);

        // 첫 번째 EditText와 ImageButton
        EditText emailInput = findViewById(R.id.emailInput);
        ImageButton btnContinue = findViewById(R.id.verificationTransmit);

        // 첫 번째 버튼의 기본 및 활성화 상태 drawable 리소스
        int defaultEmailImageResource = R.drawable.btn_login_verification_transmit;
        int activeEmailImageResource = R.drawable.ic_login_verification_color_transmit;

        emailInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    btnContinue.setImageResource(activeEmailImageResource);
                } else {
                    btnContinue.setImageResource(defaultEmailImageResource);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        // 두 번째 EditText와 ImageButton
        EditText verificationInput = findViewById(R.id.verificationInput);
        ImageButton verificationCheck = findViewById(R.id.verificationCheck);

        // 두 번째 버튼의 기본 및 활성화 상태 drawable 리소스
        int defaultVerificationImageResource = R.drawable.ic_login_verification_check;
        int activeVerificationImageResource = R.drawable.ic_login_verification_color_check;

        verificationInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    verificationCheck.setImageResource(activeVerificationImageResource);
                } else {
                    verificationCheck.setImageResource(defaultVerificationImageResource);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }
}
