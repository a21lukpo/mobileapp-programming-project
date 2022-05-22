package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView id;
    public TextView login;
    public TextView temp1;
    public TextView temp2;
    public TextView temp3;


    public ViewHolder(@NonNull View itemView){
        super(itemView);
        id = itemView.findViewById(R.id.id);
        login = itemView.findViewById(R.id.login);
        temp1 = itemView.findViewById(R.id.temp1);
        temp2 = itemView.findViewById(R.id.temp2);
        temp3 = itemView.findViewById(R.id.temp3);
    }

}
