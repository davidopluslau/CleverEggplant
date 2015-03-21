package com.theclevereggplant.clevereggplant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DemoPagerAdapter extends FragmentPagerAdapter {

    List<String> pageStrings = new ArrayList<>();

    public DemoPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        String[] pageData = context.getResources().getStringArray(R.array.textBullshit);
        pageStrings = new ArrayList<>(Arrays.asList(pageData));
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new SectionFragment();
        Bundle bundle = new Bundle();
        String content = pageStrings.get(i);
        bundle.putString("foobar", content);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return getItem(position).getArguments().getString("foobar");
    }

    @Override
    public int getCount() {
        return pageStrings.size();
    }
}
