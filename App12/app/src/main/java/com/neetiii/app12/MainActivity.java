package com.neetiii.app12;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner s1,s2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);

        String ele[]={"Programming Language","Operating System","Application"};

        ArrayAdapter<String> aa=new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,
                ele);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(aa);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String ss=s1.getSelectedItem().toString();
                ArrayAdapter<String> aa1=null;
                String pl[]={"C++","Java","PHP"};
                String os[]={"Windows","MacOs","Linux"};
                String ap[]={"MSWord","Paint","Notepad"};
                if(ss.equals("Programming Language"))
                {aa1=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        pl);
                }
                if(ss.equals("Operating System"))
                {aa1=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        os);
                }
                if(ss.equals("Application"))
                {aa1=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ap);
                }
                aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                s2.setAdapter(aa1);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
