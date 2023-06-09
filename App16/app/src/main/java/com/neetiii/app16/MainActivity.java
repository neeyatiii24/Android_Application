package com.neetiii.app16;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6;
    Button b1, b2;
    TabHost tabh;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);
        e6 = findViewById(R.id.e6);
        tabh = findViewById(R.id.tabh);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        tabh.setup();

        TabHost.TabSpec tab1 = tabh.newTabSpec("Tab1");
        tab1.setIndicator("Login");
        tab1.setContent(R.id.tab1);
        TabHost.TabSpec tab2 = tabh.newTabSpec("Tab2");
        tab2.setIndicator("Register");
        tab2.setContent(R.id.tab2);

        tabh.addTab(tab1);
        tabh.addTab(tab2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("admin") && e2.getText().toString().equalsIgnoreCase("abc")) {
                    Toast.makeText(getApplicationContext(), "Login", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();
            }

        });
    }
}

