package com.hiretowork.surabhi.hiretowork.fragments;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hiretowork.surabhi.hiretowork.BeanClasses.Developer;
import com.hiretowork.surabhi.hiretowork.R;
import com.hiretowork.surabhi.hiretowork.activities.client.ClientDashBoard;
import com.hiretowork.surabhi.hiretowork.activities.client.PostProjectActivity;
import com.hiretowork.surabhi.hiretowork.adapter.DeveloperAdapter;

import java.util.ArrayList;

public class ClientHomeFragment extends Fragment {
    RecyclerView recyclerView;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.header_main, null);

        recyclerView = v.findViewById(R.id.recycler_view_dev);
      TextView textview_loc = v.findViewById(R.id.textview_loc);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        ArrayList<Developer> developerdata = new ArrayList<>();
        Developer developer = new Developer("1", "Surabhi Mishra", R.drawable.geni, "Java, Android,GIt,Html", "Indore, India", "4.0", "Loren Ipsum is dummy content");
        Developer developer2 = new Developer("2", "Nitin Dwivedi", R.drawable.hrx, "Python,Mongo Db,PHP,HTMl", "Mumbai, India", "4.0", "Loren Ipsum is dummy content");
        Developer developer3 = new Developer("1", "Surabhi Mishra", R.drawable.geni, "Java, Android,GIt,Html", "Indore, India", "4.0", "Loren Ipsum is dummy content");
        Developer developer4 = new Developer("2", "Nitin Dwivedi", R.drawable.hrx, "Python,Mongo Db,PHP,HTMl", "Mumbai, India", "4.0", "Loren Ipsum is dummy content");
        developerdata.add(developer);
        developerdata.add(developer2);
        developerdata.add(developer3);
        developerdata.add(developer4);


        DeveloperAdapter mAdapter = new DeveloperAdapter(developerdata, getActivity());

        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        textview_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(getActivity(), PostProjectActivity.class));
            }
        });
        return v;
    }

}