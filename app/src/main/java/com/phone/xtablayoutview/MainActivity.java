package com.phone.xtablayoutview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.androidkun.xtablayout.XTabLayout;

import java.util.ArrayList;
import java.util.List;

import static com.phone.xtablayoutview.R.id.tabLayout;

public class MainActivity extends AppCompatActivity {
private XTabLayout XTabLayout;
    private ViewPager viewPage;
    private String Titles[] = new String[]{"推荐","房源","景点","活动"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         XTabLayout = (com.androidkun.xtablayout.XTabLayout) findViewById(tabLayout);
         viewPage = (ViewPager) findViewById(R.id.viewPage);
        List<Fragment> fragment = getFragment();
        XTabLayout.setxTabDisplayNum(3);//需要写在setupWithViewPager前
        ViewPageFragmentAdapter adapter = new ViewPageFragmentAdapter(getSupportFragmentManager(),getFragment());
        viewPage.setAdapter(adapter);
        XTabLayout.setupWithViewPager(viewPage);
    }

    private List<Fragment> getFragment(){
        List<Fragment> list = new ArrayList<>();
        for (int i = 0; i < Titles.length; i++) {
BlankFragment fragment = new BlankFragment();
            list.add(fragment);
        }
        return list;
    }

}
