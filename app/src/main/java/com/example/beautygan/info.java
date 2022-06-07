package com.example.beautygan;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class info extends AppCompatActivity {
    LinearLayout baseLayout;
    ListView listView;
    info_listAdapter info_listAdapter;
    ArrayList<info_list> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info1);
        baseLayout = findViewById(R.id.infoLayout);
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


        // 2. 리스트뷰
        listView = (ListView)findViewById(R.id.myListView);
        list_itemArrayList = new ArrayList<info_list>();

        list_itemArrayList.add(new info_list(R.drawable.img_product_lip, "AMUSE", "DEW VELVET 07 재즈", "20,000 원", R.drawable.ic_producturl));
        list_itemArrayList.add(new info_list(R.drawable.img_product_eyeshadow, "innisfree", "음영 정석 팔레트 8.3~8.7g 2호 화사 음영", "32,000 원", R.drawable.ic_producturl));
        list_itemArrayList.add(new info_list(R.drawable.img_product_cushion, "HERA", "블랙 쿠션 SPF 34 / PA++ 21N1 바닐라", "66,000 원", R.drawable.ic_producturl));
        list_itemArrayList.add(new info_list(R.drawable.img_product_blusher, "innisfree", "마이 블러셔 3.5g~4g [베일] 3호 발그레 코랄", "20,000 원", R.drawable.ic_producturl));
        list_itemArrayList.add(new info_list(R.drawable.img_product_contouring, "ETUDE", "플레이 101 스틱 컨투어 듀오 1호 오리지널", "13,000 원", R.drawable.ic_producturl));
        list_itemArrayList.add(new info_list(R.drawable.img_product_mascara, "AMUSE", "EYE VEGAN CLEAN LASH MASCARA 아이 비건 클린 래쉬 마스카라", "20,000 원", R.drawable.ic_producturl));


        info_listAdapter = new info_listAdapter(info.this, list_itemArrayList);
        listView.setAdapter(info_listAdapter);
    }

    // 액션버튼 메뉴 액션바에 집어 넣기
    public boolean onCreateOptionsMenu(Menu menu_info) {
        getMenuInflater().inflate(R.menu.menu_info, menu_info);
        return true;
    }

    // 액션버튼 클릭 시 동작
    @SuppressLint("NonConstantResourceId")
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home: {
                //Toast.makeText(this, "뒤로가기 버튼", Toast.LENGTH_SHORT).show();
                finish();
                return true;
            }
            case R.id.ic_youtube: {
                Toast.makeText(this, "유튜브 버튼", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.ic_download: {
                Toast.makeText(this, "다운로드 버튼", Toast.LENGTH_SHORT).show();
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