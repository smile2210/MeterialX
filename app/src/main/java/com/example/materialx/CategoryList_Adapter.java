package com.example.materialx;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CategoryList_Adapter extends BaseAdapter {

    Activity activity;
    int[] listicon;
    String[] name;
    String[] item;

    public CategoryList_Adapter(Category_ListActivity category_listActivity, int[] listicon, String[] name, String[] item) {

        activity = category_listActivity;
        this.listicon = listicon;
        this.name = name;
        this.item = item;
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

        convertView = LayoutInflater.from(activity).inflate(R.layout.categorylist_view,parent,false);

        ImageView listicon = convertView.findViewById(R.id.listicon);
        TextView name = convertView.findViewById(R.id.name);
        TextView item = convertView.findViewById(R.id.item);

        Glide.with(activity).load(this.listicon[position]).into(listicon);
        name.setText(this.name[position]);
        item.setText(this.item[position]);
        return convertView;
    }
}
