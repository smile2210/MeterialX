package com.example.materialx;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ListAdapter extends BaseAdapter {

    Activity activity;
    String[] name;
    int[] pic;

    public ListAdapter(List_BasicActivity list_basicActivity, String[] name, int[] pic) {

        activity = list_basicActivity;
        this.name = name;
        this.pic = pic;
    }

    @Override
    public int getCount() {
        return name.length;
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

        convertView = LayoutInflater.from(activity).inflate(R.layout.list_basic,parent,false);

        TextView textView = convertView.findViewById(R.id.name);
        ImageView pic = convertView.findViewById(R.id.pic);

        textView.setText(name[position]);
        Glide.with(activity).load(this.pic[position]).into(pic);
        return convertView;
    }
}
