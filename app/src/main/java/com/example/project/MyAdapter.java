package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<JsonData> JsonData;
    public MyAdapter(ArrayList<JsonData> JsonData){this.JsonData = JsonData;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_second, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        holder.id.setText(JsonData.get(position).getID());
        holder.type.setText(JsonData.get(position).getType());
        holder.company.setText(JsonData.get(position).getCompany());
        holder.name.setText(JsonData.get(position).getName());
        holder.size.setText(JsonData.get(position).getSize());
        holder.cost.setText(JsonData.get(position).getCost());
    }

    @Override
    public int getItemCount(){return JsonData.size();}
}
