package com.example.beautygan;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class select extends AppCompatActivity {
    TabHost tabHost;
    LinearLayout baseLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);

        baseLayout = findViewById(R.id.selectLayout);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null; // NullPointerException 방지

        // 1. 액션바 설정
        // (1) 액션바 타이틀 변경
        actionBar.setTitle("");

        // (2) 액션바 배경색 변경 (#F4F4F4)
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFFF4F4F4));

        // (3) 뒤로가기 버튼, 디폴트 true, 이미지 변경 (액션바가 흰색이라 이미지가 안보임)
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_previous);

        // (4) 액션바 숨기기
        // hideActionBar();

        // 탭 만드는 중
        tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tabDate = tabHost.newTabSpec("데이트");
        tabDate.setContent(R.id.tabDate);
        tabDate.setIndicator("데이트");
        tabHost.addTab(tabDate);

        TabHost.TabSpec tabHoliday = tabHost.newTabSpec("기념일");
        tabHoliday.setContent(R.id.tabHoliday);
        tabHoliday.setIndicator("기념일");
        tabHost.addTab(tabHoliday);

        TabHost.TabSpec tabFestival = tabHost.newTabSpec("축제");
        tabFestival.setContent(R.id.tabFestival);
        tabFestival.setIndicator("축제");
        tabHost.addTab(tabFestival);
    }
    // 액션버튼 메뉴 액션바에 집어 넣기
    public boolean onCreateOptionsMenu(Menu menu_select) {
        getMenuInflater().inflate(R.menu.menu_select, menu_select);
        return true;
    }

    // 액션버튼 클릭 시 동작
    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home: {
                Toast.makeText(this, "뒤로가기 버튼", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.ic_select: {
                Intent intent = new Intent(this, info.class);
                startActivity(intent);
                Toast.makeText(this, "메이크업을 선택하였습니다", Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    // 액션바 숨기기
    private void hideActionBar () {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.hide();
    }
}