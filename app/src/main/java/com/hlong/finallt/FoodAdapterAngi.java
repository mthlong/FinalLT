
package com.hlong.finallt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapterAngi extends RecyclerView.Adapter<FoodAdapterAngi.ViewHolder> {
    private ArrayList<FoodAngi> foodAngi;
    Context context;
    public FoodAdapterAngi(Context context,ArrayList<FoodAngi> foodAngi) {
        this.context = context;
        this.foodAngi = foodAngi;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_items_odau, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return foodAngi.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tittle;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            img = itemView.findViewById(R.id.Anhquan);
            tittle = itemView.findViewById(R.id.tvten);


        }
    }
}

