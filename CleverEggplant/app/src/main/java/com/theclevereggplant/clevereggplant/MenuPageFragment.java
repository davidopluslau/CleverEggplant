package com.theclevereggplant.clevereggplant;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MenuPageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.generic_scrolling_page, container, false);
        Bundle args = getArguments();
        Typeface lightFont = Typeface.createFromAsset(inflater.getContext().getAssets(), "Museo-300.otf");
        Typeface heavyFont = Typeface.createFromAsset(inflater.getContext().getAssets(), "Museo-700.otf");
        ScrollView scroller = (ScrollView) rootView.findViewById(R.id.scroller);
        String[] menuStrings = args.getStringArray(CleverPagerAdapter.MENU);
        Context context = inflater.getContext();
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < menuStrings.length / 2; i++) {
            String name = menuStrings[i * 2];
            TextView nameText = new TextView(context);
            nameText.setText(name);
            nameText.setTypeface(heavyFont);
            nameText.setGravity(Gravity.CENTER);
            layout.addView(nameText);
            String ingredients = menuStrings[i * 2 + 1];
            TextView ingredientsText = new TextView(context);
            ingredientsText.setText(ingredients);
            ingredientsText.setTypeface(lightFont);
            ingredientsText.setGravity(Gravity.CENTER);
            layout.addView(ingredientsText);
        }
        scroller.addView(layout);
        return rootView;
    }
}
