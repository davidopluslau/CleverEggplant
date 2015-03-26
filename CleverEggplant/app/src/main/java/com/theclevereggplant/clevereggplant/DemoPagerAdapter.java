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
        Fragment fragment;
        Bundle bundle = new Bundle();
        switch (i) {
            case 0:
            case 1:
                fragment = new TextVomitFragment();
                String content = pageStrings.get(i);
                bundle.putString("foobar", content);
                break;
            case 2:
                fragment = new StaffPageFragment();
                break;
            default:
                fragment = new TextVomitFragment();
                bundle.putString("foobar", "This should not be visible: there was an error in accessing page " + i);
        }
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "I am a bananaphone";
    }

    @Override
    public int getCount() {
        return pageStrings.size();
    }
}
