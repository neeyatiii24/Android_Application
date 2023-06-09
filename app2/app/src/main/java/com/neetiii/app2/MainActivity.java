package com.neetiii.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    Button b1;
    Button b2;
    Button b3;
    TextView t1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int sum = a+b;
                t1.setText(""+sum);
                Toast.makeText(getApplicationContext(),"Answer:"+sum,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int subtract = a-b;
                t1.setText(""+subtract);
                Toast.makeText(getApplicationContext(),"Answer:"+subtract,Toast.LENGTH_LONG).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = n1.getText().toString();
                String s2 = n2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int multiply = a*b;
                t1.setText(""+multiply);
                Toast.makeText(getApplicationContext(),"Answer:"+multiply,Toast.LENGTH_LONG).show();}

        });
    }
}