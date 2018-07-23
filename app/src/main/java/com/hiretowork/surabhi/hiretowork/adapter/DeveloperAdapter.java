package com.hiretowork.surabhi.hiretowork.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.hiretowork.surabhi.hiretowork.BeanClasses.Developer;
import com.hiretowork.surabhi.hiretowork.R;

import java.util.ArrayList;

public class DeveloperAdapter extends RecyclerView.Adapter<DeveloperAdapter.ViewHolder> {

    private Activity mContext;
    private String act_name;
    private ArrayList<Developer> dataSet;

    public DeveloperAdapter(ArrayList<Developer> data, Activity context) {
        this.dataSet = data;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.developer_row, parent, false);

        return new ViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        final Developer developer = dataSet.get(position);

//        viewHolder.mainLay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                System.out.println("------- clicked--- Developer adapter ");
//
//                Bundle bundle = new Bundle();
//                bundle.putString("vacancies_title", Developer.getvacancies_title());
//                bundle.putString("vacancies_icon_img", Developer.getvacancies_icon_img());
//                bundle.putString("vacancies_desc", Developer.getvacancies_desc());
//                bundle.putString("PDF", Developer.getvacancies_noti_pdf());
//                bundle.putString("date", Developer.getPost_date());
////                mContext.startActivity(new Intent(mContext, DetailDeveloper.class).putExtras(bundle));
//            }
//        });

        viewHolder.textview_name.setText(developer.getdev_name());
        viewHolder.textview_loc.setText(developer.getdev_location());
        viewHolder.textview_desc.setText(developer.getdev_desc());
        viewHolder.textview_skills.setText("Skills : "+developer.getdev_skills());



            Glide.with(mContext).load(developer.getdev_pic()).apply(RequestOptions
                    .placeholderOf(R.drawable.logo_)).into(viewHolder.imgview_profile);
////        else
//            viewHolder.imgview_profile.setImageResource(R.drawable.);


    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textview_name,textview_loc,textview_skills,textview_desc;
        private ImageView imgview_profile;


        private ViewHolder(View convertView) {
            super(convertView);
            textview_name = convertView.findViewById(R.id.textview_name);
            textview_skills = convertView.findViewById(R.id.textview_skills);
            textview_loc = convertView.findViewById(R.id.textview_loc);
            textview_desc = convertView.findViewById(R.id.textview_desc);
            imgview_profile = convertView.findViewById(R.id.imageView);
        }
    }
}
