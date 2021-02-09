package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.myapplication.adapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private ArrayList<Contacts> contactArrayList;
    private ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
     recyclerView.setLayoutManager(new LinearLayoutManager(this));
     contactArrayList = new ArrayList<Contacts>();
     int date = 10;
     contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with yash to disccuss about livo"));
     contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with warren for project"));
     contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with Liny for Web project"));
     contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with mentor"));

        contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with yash to disccuss about livo"));
        contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with warren for project"));
        contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with Liny for Web project"));
        contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with mentor"));

        contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with yash to disccuss about livo"));
        contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with warren for project"));
        contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with Liny for Web project"));
        contactArrayList.add(new Contacts(""+(date++)+"th","Meeting with mentor"));






        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, contactArrayList);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}