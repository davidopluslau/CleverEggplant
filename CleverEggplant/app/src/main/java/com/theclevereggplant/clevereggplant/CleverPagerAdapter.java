package com.theclevereggplant.clevereggplant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CleverPagerAdapter extends FragmentPagerAdapter {

    public static final String MENU = "menu";
    private final List<String> pageStrings;
    private final String[] menu;
    Typeface museoFont;

    public CleverPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        String[] pageData = context.getResources().getStringArray(R.array.textBullshit);
        String[] menu = context.getResources().getStringArray(R.array.menu_items);
        this.museoFont = Typeface.createFromAsset(context.getAssets(), "Museo-300.otf");
        pageStrings = new ArrayList<>(Arrays.asList(pageData));
        this.menu = menu;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment;
        Bundle bundle = new Bundle();
        switch (i) {
            case 0:
                fragment = new MenuPageFragment();
                bundle.putStringArray(MENU, menu);
                break;
            case 1:
            case 3:
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
