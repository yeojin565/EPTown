//메인 화면
package com.example.eptown;

import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;
import android.widget.TextView;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private TextView bannerOrderText;
    private BannerSliderAdapter bannerSliderAdapter;
    private int[] bannerImages = {
            R.drawable.banner_1,
            R.drawable.banner_2,
            R.drawable.banner_3,
            R.drawable.banner_4,
            R.drawable.banner_5
    };
    private Handler handler;
    private Runnable runnable;
    private int totalImages = bannerImages.length; // 총 배너 이미지 수
    private int currentImageIndex = 0; // 현재 배너 이미지 인덱스

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // main 뷰에 대한 인셋 리스너 설정
        View mainView = findViewById(R.id.main);
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        // 상태바 및 네비게이션 바 배경을 흰색으로, 아이콘 색상을 검정으로 설정 (API 21 이상)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            // 상태바 배경색을 흰색으로 설정
            window.setStatusBarColor(Color.WHITE);

            // 네비게이션 바 배경색을 흰색으로 설정
            window.setNavigationBarColor(Color.WHITE);

            // 상태바 및 네비게이션 바 아이콘 색상을 검정색으로 설정 (API 26 이상)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                );
            }
        }

        // ViewPager2 설정
        viewPager = findViewById(R.id.BannerImg);
        bannerOrderText = findViewById(R.id.BannerText);
        bannerSliderAdapter = new BannerSliderAdapter(bannerImages);
        viewPager.setAdapter(bannerSliderAdapter);
        viewPager.setOffscreenPageLimit(1); // 미리 로드할 페이지 수 설정

        // 커스텀 PageTransformer 설정
        viewPager.setPageTransformer(new CustomPageTransformer());

        // ViewPager2의 페이지 변경 리스너 추가
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                currentImageIndex = position; // 현재 이미지 인덱스 업데이트
                updateBannerOrderText();
            }
        });

        // 초기 텍스트 업데이트
        updateBannerOrderText();

        // 자동 슬라이딩 설정
        handler = new Handler(Looper.getMainLooper());
        runnable = new Runnable() {
            @Override
            public void run() {
                if (viewPager.getCurrentItem() == totalImages - 1) {
                    viewPager.setCurrentItem(0, false); // 마지막 페이지에서 첫 페이지로 전환 (애니메이션 없이)
                } else {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true); // 다음 페이지로 부드럽게 전환
                }
                handler.postDelayed(this, 5000); // 슬라이딩 간격을 5초로 설정
            }
        };
        handler.postDelayed(runnable, 5000); // 최초 슬라이딩 시작

        // CostPrice에 취소선 적용
        //유저 추천 상품
        TextView costPrice1TextView = findViewById(R.id.CostPrice1);
        costPrice1TextView.setPaintFlags(costPrice1TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice2TextView = findViewById(R.id.CostPrice2);
        costPrice2TextView.setPaintFlags(costPrice2TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice3TextView = findViewById(R.id.CostPrice3);
        costPrice3TextView.setPaintFlags(costPrice3TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice4TextView = findViewById(R.id.CostPrice4);
        costPrice4TextView.setPaintFlags(costPrice4TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice5TextView = findViewById(R.id.CostPrice5);
        costPrice5TextView.setPaintFlags(costPrice5TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice6TextView = findViewById(R.id.CostPrice6);
        costPrice6TextView.setPaintFlags(costPrice6TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        //반려동물 추천 상품
        TextView costPrice7TextView = findViewById(R.id.CostPrice7);
        costPrice7TextView.setPaintFlags(costPrice7TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice8TextView = findViewById(R.id.CostPrice8);
        costPrice8TextView.setPaintFlags(costPrice8TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice9TextView = findViewById(R.id.CostPrice9);
        costPrice9TextView.setPaintFlags(costPrice9TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice10TextView = findViewById(R.id.CostPrice10);
        costPrice10TextView.setPaintFlags(costPrice10TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice11TextView = findViewById(R.id.CostPrice11);
        costPrice11TextView.setPaintFlags(costPrice11TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        TextView costPrice12TextView = findViewById(R.id.CostPrice12);
        costPrice12TextView.setPaintFlags(costPrice12TextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }

    private void updateBannerOrderText() {
        // 배너 순서 텍스트 업데이트
        bannerOrderText.setText((currentImageIndex + 1) + " / " + totalImages);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable); // 핸들러 해제
    }

    // 커스텀 PageTransformer
    private class CustomPageTransformer implements ViewPager2.PageTransformer {
        @Override
        public void transformPage(@NonNull View page, float position) {
            if (position < -1) {
                page.setAlpha(0); // 현재 페이지가 뷰포트 왼쪽에 있을 때
            } else if (position <= 1) {
                page.setAlpha(1 - Math.abs(position)); // 현재 페이지의 투명도를 설정
                page.setTranslationX(-position * page.getWidth()); // 페이지의 수평 위치 조정
            } else {
                page.setAlpha(0); // 현재 페이지가 뷰포트 오른쪽에 있을 때
            }
        }
    }
}
