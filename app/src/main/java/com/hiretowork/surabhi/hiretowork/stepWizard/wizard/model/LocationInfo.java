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

package com.hiretowork.surabhi.hiretowork.stepWizard.wizard.model;

import android.support.v4.app.Fragment;
import android.text.TextUtils;


import com.hiretowork.surabhi.hiretowork.stepWizard.wizard.ui.ClientPageOne;

import java.util.ArrayList;

/**
 * A page asking for a name and an email.
 */
public class LocationInfo extends Page {

    public static final String LOCATION_DATA_KEY = "location";

    public LocationInfo(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    public Fragment createFragment() {
        return ClientPageOne.create(getKey());
    }

    @Override
    public void getReviewItems(ArrayList<ClientPage2> dest) {
        dest.add(new ClientPage2("location", mData.getString(LOCATION_DATA_KEY), getKey(), -1));
    }

    @Override
    public boolean isCompleted() {
        return !TextUtils.isEmpty(mData.getString(LOCATION_DATA_KEY));
    }
}
