/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hiretowork.surabhi.hiretowork.fragments.client;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.hiretowork.surabhi.hiretowork.R;

import java.util.Objects;

public class ClientPageSeven extends Fragment {


    public ClientPageSeven() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.client_page_three, container, false);


        TextView textview_head_title = rootView.findViewById(R.id.textview_head_title);
        CheckBox cb1 = rootView.findViewById(R.id.cb1);
        CheckBox cb2 = rootView.findViewById(R.id.cb2);
        CheckBox cb3 = rootView.findViewById(R.id.cb3);



        textview_head_title.setText(R.string.page7_head);
        Typeface font = ResourcesCompat.getFont(Objects.requireNonNull(getActivity()), R.font.arima_regular);

        cb1.setVisibility(View.VISIBLE);
        cb2.setVisibility(View.VISIBLE);
        cb3.setVisibility(View.VISIBLE);



        cb1.setText("I'll  travel to the web- designer");
        cb2.setText("The web-designer travels to me");
        cb3.setText("Phone/ Internet (No in-person meeting)");



        cb1.setTypeface(font);
        cb2.setTypeface(font);
        cb3.setTypeface(font);



        return rootView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);

//            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(
//                    Context.INPUT_METHOD_SERVICE);
//            if (!menuVisible) {
//                imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
//            }
    }
}
