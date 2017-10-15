/**
 * https://code.tutsplus.com/tutorials/getting-started-with-recyclerview-and-cardview-on-android--cms-23465
 */

package com.example.harshdeep.myrecyclerviewtutorial;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<People> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        /*firstName = (TextView) findViewById(R.id.firstName);
        lastName = (TextView) findViewById(R.id.lastName);*/
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        initData();
        System.out.println(persons);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(persons);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    public void initData()
    {
        persons = new ArrayList<>();
        persons.add(new People("Harshdeep", "Singh"));
        persons.add(new People("Guneet", "Kaur"));
        persons.add(new People("Mokshit", "Jain"));
        persons.add(new People("Robin", "Kamboj"));
    }
}
