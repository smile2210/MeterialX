package com.example.materialx;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class CustomAdapter extends BaseAdapter {

    Activity activity;
    int[] city1;

    public CustomAdapter(GridBasicActivity gridBasicActivity, int[] city) {
        activity = gridBasicActivity;
        this.city1 = city;

    }

    @Override
    public int getCount() {
        return city1.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(activity).inflate(R.layout.basic_grid,parent,false);

        ImageView imageView = convertView.findViewById(R.id.imageview);

        Glide.with(activity).load(city1[position]).into(imageView);
        return convertView;
    }
}
