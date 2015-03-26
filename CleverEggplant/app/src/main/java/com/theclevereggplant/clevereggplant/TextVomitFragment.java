package com.theclevereggplant.clevereggplant;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextVomitFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.text_vomit_page, container, false);
        Bundle args = getArguments();
        TextView textView = (TextView) rootView.findViewById(R.id.text_vomit);
        textView.setText(args.getString("foobar"));
        return rootView;
    }
}
