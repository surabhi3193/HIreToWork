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

package com.hiretowork.surabhi.hiretowork.activities.client;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.grappes.infinixindicator.InfiniXIndicator;
import com.hiretowork.surabhi.hiretowork.BaseActivity;
import com.hiretowork.surabhi.hiretowork.R;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageEight;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageFive;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageFour;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageNine;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageOne;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageSeven;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageSix;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageTEn;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageThree;
import com.hiretowork.surabhi.hiretowork.fragments.client.ClientPageTwo;
import com.hiretowork.surabhi.hiretowork.other.NonSwipeableViewPager;

public class PostProjectActivity extends BaseActivity {


    public Button mNextButton;
    public Button mPrevButton;
    NonSwipeableViewPager viewPager;

    private int finalPosition;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_project);


        mNextButton = findViewById(R.id.next_button);
        mPrevButton = findViewById(R.id.prev_button);
        viewPager = findViewById(R.id.view_pager);
        InfiniXIndicator infiniXIndicator = findViewById(R.id.infinix_indicator);

        ProjectAdapter adapter = new ProjectAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        infiniXIndicator.setViewPager(viewPager);


        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalPosition = viewPager.getCurrentItem();

                System.out.println("--- current item pos --- " + finalPosition);
                switchFragment(finalPosition + 1);
            }
        });

        mPrevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalPosition = viewPager.getCurrentItem();
                switchFragment(finalPosition - 1);
            }
        });
    }

    void switchFragment(int target) {
        if (target == 0)
            mPrevButton.setVisibility(View.INVISIBLE);

        else
            mPrevButton.setVisibility(View.VISIBLE);


        System.out.println("-------- current position ---- " + target);
        viewPager.setCurrentItem(target);
    }

    class ProjectAdapter extends FragmentPagerAdapter {

        public ProjectAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 9;
        }

        @Override
        public Fragment getItem(int position) {

//            System.out.println("--- item pos ---- " + position);
            switch (position) {

                case 0:

                    return new ClientPageOne();

                case 1:

                    return new ClientPageTwo();

                case 2:
                    return new ClientPageThree();

                case 3:
                    return new ClientPageFour();

                case 4:
                    return new ClientPageFive();

                case 5:
                    return new ClientPageSix();

                case 6:
                    return new ClientPageSeven();

                case 7:
                    return new ClientPageEight();

                case 8:
                    return new ClientPageTEn();


                default:
                    return null;

            }

//        if (mContext instanceof PostProjectActivity)
//
//            ((PostProjectActivity) mContext).mNextButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    System.out.println("Cliked fdragment ---- > " + fragment.getTag() + "---- > Next" );
//                }
//            });
//
//        ((PostProjectActivity) mContext).mPrevButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                System.out.println("Cliked fdragment ---- > " + fragment.getTag() + "---- > Prev" );
//            }
//        });
        }

    }
}
