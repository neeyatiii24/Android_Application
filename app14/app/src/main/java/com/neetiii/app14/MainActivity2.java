package com.neetiii.app14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        t2=findViewById(R.id.t2);
        Intent i=getIntent();
        String v=i.getExtras().getString("n");
        t2.setText(v);
    }
}