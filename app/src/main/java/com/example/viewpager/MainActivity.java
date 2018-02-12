package com.example.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<View> viewList;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewList = new ArrayList<View>();
        // 通过View对象作为ViewPager的数据源
        View view1 = View.inflate(this, R.layout.view1, null);
        View view2 = View.inflate(this, R.layout.view2, null);
        View view3 = View.inflate(this, R.layout.view3, null);
        View view4 = View.inflate(this, R.layout.view4, null);
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);

        // 初始化ViewPager
        pager = (ViewPager) findViewById(R.id.pager);
        // 创建PagerAdapter的适配器
        MyPagerAdapter adapter = new MyPagerAdapter(viewList);
        // ViewPager加载适配器
        pager.setAdapter(adapter);
    }
}
