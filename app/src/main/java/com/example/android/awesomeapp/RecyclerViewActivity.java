package com.example.android.awesomeapp;



import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {


    private List<Person> persons;
    private RecyclerView rv;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_activity);

        rv = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Dexter", "10 years old", R.drawable.dexter));
        persons.add(new Person("Dee Dee", "12 years old", R.drawable.dee_dee));
        persons.add(new Person("Dad", "35 years old", R.drawable.dexter_dad));
        persons.add(new Person("Mom", "33 years old", R.drawable.dexter_mom));
        persons.add(new Person("Mandark", "10 years old", R.drawable.mandark));

    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }


}
