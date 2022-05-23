package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView id;
    public TextView type;
    public TextView company;
    public TextView name;
    public TextView size;
    public TextView cost;


    public ViewHolder(@NonNull View itemView){
        super(itemView);
        id = itemView.findViewById(R.id.id);
        type = itemView.findViewById(R.id.type);
        company = itemView.findViewById(R.id.company);
        name = itemView.findViewById(R.id.name);
        size = itemView.findViewById(R.id.size);
        cost = itemView.findViewById(R.id.cost);
    }

}
