package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        // 메인화면에서 검색 아이콘 눌렀을때 검색으로 화면 이동
        ImageView image8 = (ImageView) findViewById(R.id.searchIcon);
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageView image8_ = (ImageView) findViewById(R.id.btnSearchBack);
        image8_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 검색 아이콘 눌렀을때 검색 디테일로 화면 이동
        ImageView image = (ImageView) findViewById(R.id.searchIcon_);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SearchDetailsActivity.class);
                startActivity(intent);
            }
        });
    }

}