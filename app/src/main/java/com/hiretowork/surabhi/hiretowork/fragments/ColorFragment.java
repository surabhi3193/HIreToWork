package com.hiretowork.surabhi.hiretowork.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hiretowork.surabhi.hiretowork.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

//    Fragment[] colors = new Fragment[]{ClientPageOne, ClientPageTwo};

    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_color, container, false);
//        v.setBackgroundColor(Color.parseColor(colors[this.getArguments().getInt("index")]));
        return v;
    }

}
