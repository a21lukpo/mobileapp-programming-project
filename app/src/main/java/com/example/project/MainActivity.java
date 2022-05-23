package com.example.project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener{

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a21lukpo";
    private RecyclerView recyclerView;
    private MyAdapter recyclerAdapter;
    private ArrayList<JsonData> JsonData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new JsonTask(this).execute(JSON_URL);

        recyclerView = findViewById(R.id.recyclerView);
        JsonData = new ArrayList<JsonData>();
        recyclerAdapter = new MyAdapter(JsonData);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<JsonData>>() {}.getType();
        ArrayList<JsonData> array = gson.fromJson(json, type);
        JsonData.addAll(array);
        recyclerAdapter.notifyDataSetChanged();
    }
}
