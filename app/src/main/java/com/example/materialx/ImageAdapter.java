package com.example.materialx;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.DataHolder>{
    
    Activity activity;
    String[] name;
    String[] item;
    int[] background;

    public ImageAdapter(Category_ImageActivity category_imageActivity, String[] name, String[] item, int[] background) {
    
        activity = category_imageActivity;
        this.name = name;
        this.item = item;
        this.background = background;
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        
        View view = LayoutInflater.from(activity).inflate(R.layout.category_image_view,parent,false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DataHolder holder, final int position) {

        Glide.with(activity).load(background[position]).into(holder.back);
        holder.text1.setText(name[position]);
        holder.text2.setText(item[position]);
        
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"item"+" "+name[position]+" "+"clicked",Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class DataHolder extends RecyclerView.ViewHolder {
        TextView text1,text2;
        ImageView back;
        
        public DataHolder(@NonNull View itemView) {
            super(itemView);
            
            text1 = itemView.findViewById(R.id.name);
            text2 = itemView.findViewById(R.id.items);
            back = itemView.findViewById(R.id.back);
        }
    }
}
