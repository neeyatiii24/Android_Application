package com.neetiii.app9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=findViewById(R.id.s1);
        String s []={"Programming Language" , "Operating System" , "Application Software"};
        ArrayAdapter<String> aa=new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,s);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(aa);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent,
                                       View view, int position, long id) {
                String s=s1.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),
                        s,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}