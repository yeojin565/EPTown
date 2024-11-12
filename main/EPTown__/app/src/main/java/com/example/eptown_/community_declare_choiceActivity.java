package com.example.eptown_;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class community_declare_choiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.community_declare_choice);

        // 추가된 코드 시작
        TextView choiceThree = findViewById(R.id.choiceThree);  // XML에 있는 TextView ID와 일치하게 작성
        ImageView checkedColor = findViewById(R.id.checkedColor); // XML에 있는 ImageView ID와 일치하게 작성

        // 초기에는 ImageView가 보이지 않게 설정
        checkedColor.setVisibility(View.GONE);

        // TextView 클릭 이벤트 설정
        choiceThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 글자 색상을 오렌지로 변경
                choiceThree.setTextColor(Color.parseColor("#FFF59701"));
                // 체크 이미지 보이기
                checkedColor.setVisibility(View.VISIBLE);
            }
        });
        // 추가된 코드 끝
    }
}
