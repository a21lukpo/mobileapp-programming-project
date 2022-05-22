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
        holder.id.setText(JsonData.get(position).getId());
        holder.login.setText(JsonData.get(position).getLogin());
        holder.temp1.setText(JsonData.get(position).getTemp1());
        holder.temp2.setText(JsonData.get(position).getTemp2());
        holder.temp3.setText(JsonData.get(position).getTemp3());
    }

    @Override
    public int getItemCount(){return JsonData.size();}
}
