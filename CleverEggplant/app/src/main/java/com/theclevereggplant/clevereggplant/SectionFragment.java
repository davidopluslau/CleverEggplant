package com.theclevereggplant.clevereggplant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SectionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.lauBuiltThisShittyVariableName)).setText(args.getString("foobar"));
        return rootView;
    }
}
