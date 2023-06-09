package com.neetiii.app6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        rg=findViewById(R.id.rg);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            r1=findViewById(rg.getCheckedRadioButtonId());
                Toast.makeText(getApplicationContext(),
                        r1.getText().toString(), Toast.LENGTH_SHORT).show();
            r2=findViewById(rg.getCheckedRadioButtonId());
                Toast.makeText(getApplicationContext(),
                        r2.getText().toString(), Toast.LENGTH_SHORT).show();
            r3=findViewById(rg.getCheckedRadioButtonId());
                Toast.makeText(getApplicationContext(),
                        r3.getText().toString(), Toast.LENGTH_SHORT).show();
            r4=findViewById(rg.getCheckedRadioButtonId());
                Toast.makeText(getApplicationContext(),
                        r4.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}




