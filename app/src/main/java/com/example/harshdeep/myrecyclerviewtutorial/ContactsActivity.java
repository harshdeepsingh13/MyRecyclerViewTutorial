package com.example.harshdeep.myrecyclerviewtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<People> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        initData();
        System.out.println(persons);
        MyRecyclerViewClickListener myRecyclerViewClickListener = (view, position) -> {
            Intent intent = new Intent(this,InfoActivity.class);
            intent.putExtra("firstName",persons.get(position).getFirstName());
            intent.putExtra("lastName",persons.get(position).getLastName());
            new Thread(() -> {
                try {
                    Thread.currentThread().sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(intent);
            }).start();
        };
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(persons, myRecyclerViewClickListener);
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
