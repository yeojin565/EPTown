package com.example.eptown_;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryFeed4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_feed4);

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageView image = (ImageView) findViewById(R.id.btnCategoryFeed4Back);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //모든 연령 눌렀을때 카테고리 사료1로 화면 이동
        TextView textFeed1 = findViewById(R.id.allAge);
        textFeed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, CategoryFeed1Activity.class);
                startActivity(intent);
            }
        });

        //키튼 눌렀을때 카테고리 사료2로 화면 이동
        TextView textFeed2 = findViewById(R.id.kitten);
        textFeed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, CategoryFeed2Activity.class);
                startActivity(intent);
            }
        });

        //어덜트 눌렀을때 카테고리 사료3으로 화면 이동
        TextView textFeed3 = findViewById(R.id.adualt);
        textFeed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, CategoryFeed3Activity.class);
                startActivity(intent);
            }
        });

        //상품 이름1 눌렀을때 아이템 디테일로 화면 이동
        TextView textFeed4 = findViewById(R.id.firstNameOne);
        textFeed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, ItemDetails.class);
                startActivity(intent);
            }
        });

        //상품 이름2 눌렀을때 아이템 디테일로 화면 이동
        TextView textFeed5 = findViewById(R.id.firstNameTwo);
        textFeed5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, ItemDetails.class);
                startActivity(intent);
            }
        });

        // 탭바에서 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageView image1 = (ImageView) findViewById(R.id.nowTapHomeIconCategoryFeed4);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageView image2 = (ImageView) findViewById(R.id.tapCommunityIconCategoryFeed4);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageView image3 = (ImageView) findViewById(R.id.tapCategoryIconCategoryFeed4);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, CategoryMainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageView image4 = (ImageView) findViewById(R.id.tapHostpitalIconCategoryFeed4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this, HospitalDetailsActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 내 정보 아이콘 눌렀을때 내 정보로 화면 이동
        ImageView image5 = (ImageView) findViewById(R.id.tapMypageIconCategoryFeed4);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CategoryMainActivity 화면 전환
                Intent intent = new Intent(CategoryFeed4Activity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 알림 아이콘 눌렀을때 알림으로 화면 이동
        ImageView image6 = (ImageView) findViewById(R.id.searchIcon);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this,NoticeActivity.class);
                startActivity(intent);
            }
        });

        // 장바구니 눌렀을때 장바구니로 화면 이동
        ImageView image7 = (ImageView) findViewById(R.id.cartIcon);
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this,CartActivity.class);
                startActivity(intent);
            }
        });

        // 상품 이미지 눌렀을때 아이템 디테일로 화면 이동
        ImageView image8 = (ImageView) findViewById(R.id.firstImage);
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed4Activity.this,ItemDetails.class);
                startActivity(intent);
            }
        });

    }
}
