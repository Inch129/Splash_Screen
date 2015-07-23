package com.example.splash_screen;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class HomeActivity extends ActionBarActivity {

    ArrayList<ItemA> data = new ArrayList<>(50);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView listView = (ListView) findViewById(R.id.listView);


        for (int i = 1; i < 21; i++) {

            ItemA item = new ItemA("Item "+i);
            data.add(item);
        }
        MyAdapter my = new MyAdapter(this, data);
        listView.setAdapter(my);
    }
}
