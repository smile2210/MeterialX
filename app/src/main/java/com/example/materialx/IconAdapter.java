package com.example.materialx;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class IconAdapter extends RecyclerView.Adapter<IconAdapter.IconHolder>{

    Activity activity;
    int[] icon;

    public IconAdapter(Category_ListActivity category_listActivity, int[] icon) {

        activity = category_listActivity;
        this.icon = icon;
    }

    @NonNull
    @Override
    public IconHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.icon,parent,false);
        return new IconHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IconHolder holder, int position) {

        holder.image.setImageResource(icon[position]);

    }

    @Override
    public int getItemCount() {
        return icon.length;
    }

    public class IconHolder extends RecyclerView.ViewHolder {
        ImageView image;

        public IconHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.icon);
        }
    }
}
