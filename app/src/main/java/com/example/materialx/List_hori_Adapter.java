package com.example.materialx;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class List_hori_Adapter extends BaseAdapter {

    Activity activity;
    String[] txt1;
    String[] txt2;
    int[] text,pics;

    public List_hori_Adapter(List_HorizontalActivity list_horizontalActivity, int[] news, int[] pic, String[] text1, String[] text2) {

        activity = list_horizontalActivity;
        txt1 = text1;
        txt2 = text2;
        pics = pic;
        text = news;
    }

    @Override
    public int getCount() {
        return text.length;
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

        convertView = LayoutInflater.from(activity).inflate(R.layout.list_horizontal,parent,false);

        TextView textview = convertView.findViewById(R.id.maintext);
        TextView text1 = convertView.findViewById(R.id.text1);
        TextView text2 = convertView.findViewById(R.id.text2);
        ImageView pic = convertView.findViewById(R.id.image);

        Glide.with(activity).load(pics[position]).into(pic);
        textview.setText(text[position]);
        text1.setText(txt1[position]);
        text2.setText(txt2[position]);

        return convertView;
    }
}
