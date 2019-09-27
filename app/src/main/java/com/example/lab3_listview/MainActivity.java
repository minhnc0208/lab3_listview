package com.example.lab3_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arrayList = new ArrayList<>();
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list= (ListView)findViewById(R.id.list);
        arrayList.add("Andoid cơ bản ");
        arrayList.add("Android nâng cao");
        arrayList.add("Thiết kế giao diện trên Android");
        arrayList.add("Test và triển khai ứng dụng Android");
        arrayList.add("NodeJS");
        arrayList.add("Game 2D");
        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(adapter);
    }
}
