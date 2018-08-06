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

import com.hiretowork.surabhi.hiretowork.R;

import java.util.Objects;

public class ClientPageThree extends Fragment {


    public ClientPageThree() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.client_page_three, container, false);

        CheckBox cb1 = rootView.findViewById(R.id.cb1);
        CheckBox cb2 = rootView.findViewById(R.id.cb2);
        Typeface font = ResourcesCompat.getFont(Objects.requireNonNull(getActivity()), R.font.arima_regular);


        cb1.setVisibility(View.VISIBLE);
        cb2.setVisibility(View.VISIBLE);

        cb1.setText(R.string.new_website);
        cb2.setText(R.string.existing_web);
        cb1.setTypeface(font);
        cb2.setTypeface(font);

        return rootView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

}
