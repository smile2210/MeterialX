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

import java.nio.channels.AcceptPendingException;
import java.util.List;

public class ProductGridAdapter extends RecyclerView.Adapter<ProductGridAdapter.ModelHolder> {

    Activity activity;
    List<ModelClass> modelClassList;

    public ProductGridAdapter(Product_gridActivity product_gridActivity, List<ModelClass> modelClassList) {

        activity = product_gridActivity;
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public ModelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.product_grid_view,parent,false);
        return new ModelHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelHolder holder, final int position) {

        Glide.with(activity).load(modelClassList.get(position).getProduct()).into(holder.product);
        holder.name.setText(modelClassList.get(position).getName());
        holder.price.setText(modelClassList.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"item"+" "+modelClassList.get(position).getName()+" "+"clicked",Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class ModelHolder extends RecyclerView.ViewHolder {
        TextView name,price;
        ImageView product;

        public ModelHolder(@NonNull View itemView) {
            super(itemView);
             product = itemView.findViewById(R.id.product);
             name = itemView.findViewById(R.id.name);
             price = itemView.findViewById(R.id.price);
        }
    }
}
