package com.example.viewpager;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private List<View> viewList;
    private ViewPager pager;
    private PagerTabStrip pagerTabStrip;
    private List<String> titleList;
    private List<Fragment> fragmentList;

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

        // 通过Fragment作为ViewPager的数据源
        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new Fragment1());
        fragmentList.add(new Fragment2());
        fragmentList.add(new Fragment3());
        fragmentList.add(new Fragment4());

        // 为ViewPager页卡设置标题
        titleList = new ArrayList<String>();
        titleList.add("第一页");
        titleList.add("第二页");
        titleList.add("第三页");
        titleList.add("第四页");

        // PagerTabStrip设置一些属性
        pagerTabStrip = (PagerTabStrip) findViewById(R.id.pagerTabStrip);
        pagerTabStrip.setBackgroundColor(Color.YELLOW);
        pagerTabStrip.setTextColor(Color.RED);
        pagerTabStrip.setDrawFullUnderline(false);
        pagerTabStrip.setTabIndicatorColor(Color.GREEN);

        // 初始化ViewPager
        pager = (ViewPager) findViewById(R.id.pager);

        // 创建PagerAdapter的适配器
        MyPagerAdapter adapter = new MyPagerAdapter(viewList, titleList);

        // ViewPager加载适配器
        //pager.setAdapter(adapter);

        MyFragmentPagerAdapter adapter2 = new MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList, titleList);
        //pager.setAdapter(adapter2);

        MyFragmentPagerAdapter2 adapter3 = new MyFragmentPagerAdapter2(getSupportFragmentManager(), fragmentList, titleList);
        pager.setAdapter(adapter3);
    }
}
