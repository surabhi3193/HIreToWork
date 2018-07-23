package com.hiretowork.surabhi.hiretowork.activities.client;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.internal.NavigationMenuView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.hiretowork.surabhi.hiretowork.BaseActivity;
import com.hiretowork.surabhi.hiretowork.BeanClasses.Developer;
import com.hiretowork.surabhi.hiretowork.R;
import com.hiretowork.surabhi.hiretowork.adapter.DeveloperAdapter;
import com.hiretowork.surabhi.hiretowork.fragments.ClientHomeFragment;
import com.infideap.drawerbehavior.AdvanceDrawerLayout;

import java.util.ArrayList;

public class ClientDashBoard extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {


    public static Fragment fragment;
    AdvanceDrawerLayout drawer;
    Class fragmentClass;
    Intent i;
    boolean doubleBackToExitPressedOnce = false;




    private void disableNavigationViewScrollbars(NavigationView navigationView) {
        if (navigationView != null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) navigationView.getChildAt(0);
            if (navigationMenuView != null) {
                navigationMenuView.setVerticalScrollBarEnabled(false);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_dash_board);
        //NavigationView

        Toolbar toolbar = findViewById(R.id.toolbar);
        NavigationView navigationView = findViewById(R.id.nav_view);
        drawer = findViewById(R.id.drawer_layout);

        drawer = findViewById(R.id.drawer_layout);
        View headerview = navigationView.getHeaderView(0);
        navigationView.setItemIconTintList(null);
        navigationView.setVerticalScrollBarEnabled(false);
        setSupportActionBar(toolbar);

        navigationView.setNavigationItemSelectedListener(this);

        drawer.setViewScale(Gravity.END, 0.9f);
        drawer.setRadius(Gravity.END, 10);
        drawer.setViewElevation(Gravity.END, 60);
        fragmentClass = ClientHomeFragment.class;

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fragment != null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_right_drawer:
                drawer.openDrawer(Gravity.END);

                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    public void openFragment()
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
