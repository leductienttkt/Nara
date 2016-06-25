package com.example.phamduyen.bongda;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

import adapter.Menu_Iteam_Adapter;
import bean.menuItem;

public class MainUser extends Activity {
    GridView gridView;
    ArrayAdapter<menuItem> adapter ;
    ArrayList<menuItem> menuItemArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_user);
        gridView = (GridView)findViewById(R.id.menuViewUser);

        menuItemArrayList = new ArrayList<>();
        menuItemArrayList.add(new menuItem(R.drawable.create_new,"Thêm Sân"));
        menuItemArrayList.add(new menuItem(R.drawable.create_new,"Quản Lý Đăng kí"));
        menuItemArrayList.add(new menuItem(R.drawable.create_new,"Cập nhật sân"));

        adapter = new Menu_Iteam_Adapter(this,R.layout.menu_main_user,menuItemArrayList);
        gridView.setAdapter(adapter);
    }
}
