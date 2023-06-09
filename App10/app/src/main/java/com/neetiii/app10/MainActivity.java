package com.neetiii.app10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Spinner s1;
    EditText e1;
    boolean checkPrime(int n){
        int c=0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return c;
    }
    int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
String isoddeven(int n){
        if(n%2!=0) {
            return "odd";
        }
        else{
            return "even";
        }
}
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        s1=findViewById(R.id.s1);
        e1=findViewById(R.id.e1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s [] = {"Check Prime" , "Factorial" , "Even/Odd"};
                ArrayAdapter<String> aa= new ArrayAdapter<>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,s);
                aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                s1.setAdapter(aa);
                s1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String abc=s1.getSelectedItem().toString();
                        if(abc.equalsIgnoreCase("Check Prime")){
                            if(checkPrime(Integer.parseInt(e1.getText().toString())))==2{
                                Toast.makeText(getApplicationContext(),
                                        "Prime Number", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(getApplicationContext(),
                                       "Not a Prime Number", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else if(abc.equalsIgnoreCase("Factorial")){
                            int x=factorial(Integer.parseInt(e1.getText().toString()));
                            Toast.makeText(getApplicationContext(),
                                            "Factorial=" +x,Toast.LENGTH_SHORT).show();

                        }
                        else if(abc.equalsIgnoreCase("Even/Odd")){
                            Toast.makeText(getApplicationContext(),
                                    isoddeven(Integer.parseInt(e1.getText().toString())),
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });


            }
        });

    }
}