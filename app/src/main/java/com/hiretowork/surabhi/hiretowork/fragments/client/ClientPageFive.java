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

public class ClientPageFive extends Fragment {


    public ClientPageFive() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.client_page_three, container, false);


        TextView textview_head_title = rootView.findViewById(R.id.textview_head_title);
        CheckBox cb1 = rootView.findViewById(R.id.cb1);
        CheckBox cb2 = rootView.findViewById(R.id.cb2);
        CheckBox cb3 = rootView.findViewById(R.id.cb3);
        CheckBox cb4 = rootView.findViewById(R.id.cb4);
        CheckBox cb5 = rootView.findViewById(R.id.cb5);

        textview_head_title.setText(R.string.page5_head);
        Typeface font = ResourcesCompat.getFont(Objects.requireNonNull(getActivity()), R.font.arima_regular);

        cb1.setVisibility(View.VISIBLE);
        cb2.setVisibility(View.VISIBLE);
        cb3.setVisibility(View.VISIBLE);
        cb4.setVisibility(View.VISIBLE);
        cb5.setVisibility(View.VISIBLE);

        cb1.setText("What the web-designer/web-developers recommends");
        cb2.setText("Squarespace");
        cb3.setText("Wordpress");
        cb4.setText("Wlx");
        cb5.setText("Weebly");

        cb1.setTypeface(font);
        cb2.setTypeface(font);
        cb3.setTypeface(font);
        cb4.setTypeface(font);
        cb5.setTypeface(font);

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
