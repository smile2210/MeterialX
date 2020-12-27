package com.example.materialx;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

import static com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_LONG;

public class TwoAdapter extends BaseAdapter {

    Activity activity;
    int[] image;
    String[] T1,T2;

    public TwoAdapter(TowLineActivity towLineActivity, int[] i1, String[] t1, String[] t2) {

        activity = towLineActivity;
        this.image = i1;
        this.T1 = t1;
        this.T2 = t2;
    }

    @Override
    public int getCount() {
        return image.length;
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

        convertView = LayoutInflater.from(activity).inflate(R.layout.twoline,parent,false);

        ImageView i1 = convertView.findViewById(R.id.i1);
        TextView text = convertView.findViewById(R.id.t1);
        TextView t2 = convertView.findViewById(R.id.t2);

        Glide.with(activity).load(image[position]).into(i1);
        text.setText(T1[position]);
        t2.setText(T2[position]);
        return convertView;
    }
}
