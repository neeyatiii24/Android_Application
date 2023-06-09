package com.neetiii.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,c1,o1,o2,o3,o4,o5,o6;
    EditText e1;
    float num1, num2;
    boolean add, sub, mul, div;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        c1=findViewById(R.id.c1);
        o1=findViewById(R.id.o1);
        o2=findViewById(R.id.o2);
        o3=findViewById(R.id.o3);
        o4=findViewById(R.id.o4);
        o5=findViewById(R.id.o5);
        o6=findViewById(R.id.o6);
        e1=findViewById(R.id.e1);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"9");
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
            }
        });
        
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1==null) {
                    e1.setText("");
                }
                else {
                    num1=Float.parseFloat(e1.getText()+"");
                    add=true;
                    e1.setText(null);
                }
            }
        });

        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1==null) {
                    e1.setText("");
                }
                else {
                    num1=Float.parseFloat(e1.getText()+"");
                    sub=true;
                    e1.setText(null);
                }
            }
        });

        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1==null) {
                    e1.setText("");
                }
                else {
                    num1=Float.parseFloat(e1.getText()+"");
                    mul=true;
                    e1.setText(null);
                }
            }
        });

        o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1==null) {
                    e1.setText("");
                }
                else {
                    num1=Float.parseFloat(e1.getText()+"");
                    div=true;
                    e1.setText(null);
                }
            }
        });

        o5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2=Float.parseFloat(e1.getText()+"");
                if(add==true) {
                    e1.setText(num1+num2+"");
                    add=false;
                }
                if(sub==true) {
                    e1.setText(num1-num2+"");
                    sub=false;
                }
                if(mul==true) {
                    e1.setText(num1*num2+"");
                    mul=false;
                }
                if(div==true) {
                    e1.setText(num1/num2+"");
                    div=false;
                }

            }
        });

        o6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+".");
            }
        });
    }
}