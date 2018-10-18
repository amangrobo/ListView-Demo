package com.example.avisheksingh.justjavaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        final ArrayList<String> myFriends = new ArrayList<String>();

        myFriends.add("Avishek");
        myFriends.add("Sameer");
        myFriends.add("Saiyyam");
        myFriends.add("Aayush");
        myFriends.add("Kabra");
        myFriends.add("Samrath");
        myFriends.add("Rishabh");
        myFriends.add("Raushan");
        myFriends.add("Samrath");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriends);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Hello! " + myFriends.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
