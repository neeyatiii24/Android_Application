package com.neetiii.app15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1, p1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        p1=findViewById(R.id.p1);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e1.getText().toString();
                String s1 = p1.getText().toString();
                Intent i = new Intent(getApplicationContext(),ActivityTwo.class);
                i.putExtra("user" ,s);
                i.putExtra("pass",s1);
                startActivity(i);
         }
});
    }
}