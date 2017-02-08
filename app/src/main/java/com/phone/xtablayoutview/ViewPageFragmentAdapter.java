package com.phone.xtablayoutview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Lenovo-SXX on 2017/2/8.
 */

public class ViewPageFragmentAdapter extends FragmentPagerAdapter {
    private String Titles[] = new String[]{"推荐","房源","景点","活动"};
    private List<Fragment> fragmentList;
    public ViewPageFragmentAdapter(FragmentManager fm,List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }
}
