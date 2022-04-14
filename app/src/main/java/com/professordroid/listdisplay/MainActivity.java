package com.professordroid.listdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //String[] arrayPlatforms = {"Android", "IOS", "Ubuntu", "Windows"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arrayPlatforms = getResources().getStringArray(R.array.array_platforms);

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this, R.layout.item_platforms, arrayPlatforms
        );

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You clicked " + arrayPlatforms[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}