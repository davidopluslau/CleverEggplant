package com.theclevereggplant.clevereggplant;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class StaffPageFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.staff_page, container, false);
        Typeface font = Typeface.createFromAsset(inflater.getContext().getAssets(), "Museo-300.otf");
        TextView viewById = (TextView) rootView.findViewById(R.id.david_blurb);
        viewById.setTypeface(font);
        viewById = (TextView) rootView.findViewById(R.id.rachel_blurb);
        viewById.setTypeface(font);
        viewById = (TextView) rootView.findViewById(R.id.stephanie_blurb);
        viewById.setTypeface(font);
        viewById = (TextView) rootView.findViewById(R.id.jason_blurb);
        viewById.setTypeface(font);
        return rootView;
    }
}
