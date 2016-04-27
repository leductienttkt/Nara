package com.example.phamduyen.bongda;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

import adapter.MyAdapter;
import bean.Person;

/**
 * Created by Pham Duyen on 23/04/2016.
 */
public class ListMatchActivity extends Activity{
    GridView gv;
    ArrayAdapter<Person>  adapter;
    ArrayList<Person> arrayListPersons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_match);
        gv = (GridView) findViewById(R.id.gridView);


        arrayListPersons = new ArrayList<>();
        arrayListPersons.add(new Person("Phương","012431564"));
        arrayListPersons.add(new Person("Hương","0134431564"));
        arrayListPersons.add(new Person("Kiet","0198631564"));

        adapter = new MyAdapter(this,R.layout.listitem_person,arrayListPersons);
        gv.setAdapter(adapter);

    }
}
