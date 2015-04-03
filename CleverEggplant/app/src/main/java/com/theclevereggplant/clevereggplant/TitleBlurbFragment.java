package com.theclevereggplant.clevereggplant;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class TitleBlurbFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.generic_scrolling_page, container, false);
        Bundle args = getArguments();
        Typeface lightFont = Typeface.createFromAsset(inflater.getContext().getAssets(), "Museo-300.otf");
        Typeface heavyFont = Typeface.createFromAsset(inflater.getContext().getAssets(), "Museo-700.otf");
        ScrollView scroller = (ScrollView) rootView.findViewById(R.id.scroller);
        String[] menuStrings = args.getStringArray(CleverPagerAdapter.STRING_PAIRS);
        Context context = inflater.getContext();
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        int gravity = args.getInt(CleverPagerAdapter.GRAVITY);
        for (int i = 0; i < menuStrings.length / 2; i++) {
            String titleText = menuStrings[i * 2];
            TextView titleView = new TextView(context);
            titleView.setText(titleText);
            titleView.setTypeface(heavyFont);
            titleView.setGravity(gravity);
            layout.addView(titleView);
            String blurbText = menuStrings[i * 2 + 1];
            TextView blurbView = new TextView(context);
            blurbView.setText(blurbText);
            blurbView.setTypeface(lightFont);
            blurbView.setGravity(gravity);
            layout.addView(blurbView);
        }
        scroller.addView(layout);
        return rootView;
    }
}
