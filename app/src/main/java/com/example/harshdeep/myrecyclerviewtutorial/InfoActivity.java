package com.example.harshdeep.myrecyclerviewtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView infoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        String valFirstName = intent.getStringExtra("firstName");
        String valLastName = intent.getStringExtra("lastName");

        infoTextView = (TextView) findViewById(R.id.infoTextView);
        infoTextView.setText("Hey this is " + valFirstName + " " + valLastName + ", this side.");

    }
}
