package com.example.tutorial_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        uname = findViewById(R.id.txtuname);
        String user = getIntent().getStringExtra("username");
        uname.setText("Welcome "+user);
    }
}