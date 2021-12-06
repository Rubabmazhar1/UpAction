package com.example.upaction;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;

public class ChildActivity extends AppCompatActivity {
private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        //getSupportActionBar().setTitle("ChildActivity");
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // button2=findViewById(R.id.button2);
       // button2.setOnClickListener((v)->{openChildActivity(); });
        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.activity_child_toolbar);
        setSupportActionBar(myChildToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}