package com.neetiii.app13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner s1,s2,s3,s4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);
        b1=findViewById(R.id.b1);

        String country[]={"India","Nepal","China"};

        ArrayAdapter<String> aa=new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,
                country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(aa);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String ss = s1.getSelectedItem().toString();
                ArrayAdapter<String> a11=null;
                String in[] = {"Rajasthan","Maharashtra","Gujarat"};
                String ne[] = {"Bagmati","Gandaki","Madhesh"};
                String ch[] = {"Henan", "Sichuan", "Hebai"};
                if(ss.equals("India"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        in);
                }
                if(ss.equals("Nepal"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ne);
                }
                if(ss.equals("China"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ch);
                }
                a11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                s2.setAdapter(a11);
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String ss = s2.getSelectedItem().toString();
                ArrayAdapter<String> a11=null;
                String ra[] = {"Jodhpur","Jaipur","Udaipur"};
                String mh[] = {"Pune","Mumbai","Nagpur"};
                String gu[] = {"Ahemdabad","Surat","Rajkot"};

                String ba[] = {"Kathmandu","Lalitpur","Bharatpur"};
                String ga[] = {"Pokhara","Gorkha","Chami"};
                String ma[] = {"Janakpur","Birgunj","Balawa"};

                String he[] = {"Nanyang", "Luoyang", "Sanmenxia"};
                String si[] = {"Leshan", "Chengdu", "Yaan"};
                String hb[] = {"Baoding", "Xingtai","Langfang"};

                if(ss.equals("Rajasthan"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ra);
                }
                if(ss.equals("Maharashtra"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        mh);
                }
                if(ss.equals("Gujarat"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        gu);
                }

                if(ss.equals("Bagmati"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ba);
                }
                if(ss.equals("Gandaki"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ga);
                }
                if(ss.equals("Madhesh"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ma);
                }

                if(ss.equals("Henan"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        he);
                }
                if(ss.equals("Sichuan"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        si);
                }
                if(ss.equals("Hebai"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        hb);
                }
                a11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                s3.setAdapter(a11);

            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String ss = s3.getSelectedItem().toString();
                ArrayAdapter<String> a11=null;
                String jo[] = {"Sardarpura","Shastri Nagar","Ratanada"};
                String ja[] = {"Vaishali Nagar","Kalwar Road","Jagatpura"};
                String ud[] = {"Sarada", "Bhinder", "Jhadol"};

                String pu[] = {"Shivaji Nagar","Baner","Aundh"};
                String mu[] = {"Andhari","Bhandra","Juhu"};
                String na[] = {"Bank Colony", "Kachimet", "Kalameshwar"};

                String ah[] = {"Bhadra","Ambly","Bhadaj"};
                String su[] = {"Adajan","Athwa Gate","Bhatar Road"};
                String ra[] = {"Arya Nagar", "Gandhigram", "Lodhika"};



                String ka[] = {"Thamel", "Lazimpat", "Boudha"};
                String la[] = {"DevGarh Hill", "MardanSingh Fort", "Mahavir Wildlife Santury"};
                String bh[] = {"Durbar Square", "55 Windows Palace", "Taumadhi Square"};

                String po[] = {"Devi's Fall", "Phewa Lake", "Sarankot"};
                String go[] = {"Manasalu", "Laprak", "Manakamana Temple"};
                String cm[] = {"Circuit Treck", "Himal Treck", "Tilicho Lake"};

                String jn[] = {"Kamalamai", "Bhimeshwor", "Dhalkebar"};
                String bi[] = {"Thrill Factory", "Ghadiarwa Pokhari", "Shree Gahawamai Temple"};
                String bl[] = {"Maya Devi", "Shree Bindhyabasini ", "Narayanhiti Palace"};



                String nn[] = {"Spring Temple Buddha", "Shiren Mountain Mountain", "Tongbai Mountain"};
                String lu[] = {"Longmen Grottoes", "White House Temple", "Shaolin Temple"};
                String sn[] = {"Huanghe Forest Park", "Swan Lake", "The Yellow River"};

                String le[] = {"Leshan Giant Buddha", "Jinding Mountain", "Baoguo Temple"};
                String ce[] = {"Wenshu Yuan Monastery", "Leshan Giant Buddha", "Anshun Bridge"};
                String ya[] = {"Bifeng Valley", "Anshun Ground", "Wawu Mountain"};

                String bo[] = {"Baishi Mountain","Langya Mountain","Tailing"};
                String xi[] = {"Taihang Shan","Qilihe Sports Park","Kongshan White Cloud Cave"};
                String ln[] = {"Shengfang Ancient Town", "Yanjiao Park", "langfang stadium"};


                if(ss.equals("Jodhpur"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        jo);
                }
                if(ss.equals("Jaipur"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ja);
                }
                if(ss.equals("Udaipur"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ud);
                }

                if(ss.equals("Pune"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        pu);
                }
                if(ss.equals("Mumbai"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        mu);
                }
                if(ss.equals("Nagpur"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        na);
                }

                if(ss.equals("Ahemdabad"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ah);
                }
                if(ss.equals("Surat"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        su);
                }
                if(ss.equals("Rajkot"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ra);
                }

                if(ss.equals("Kathmandu"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ka);
                }
                if(ss.equals("Lalitpur"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        la);
                }
                if(ss.equals("Bharatpur"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        bh);
                }

                if(ss.equals("Pokhara"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        po);
                }
                if(ss.equals("Gorkha"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        go);
                }
                if(ss.equals("Chami"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        cm);
                }

                if(ss.equals("Janakpur"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        jn);
                }
                if(ss.equals("Birgunj"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        bi);
                }
                if(ss.equals("Balawa"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        bl);
                }

                if(ss.equals("Nanyang"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        nn);
                }
                if(ss.equals("Luoyang"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        lu);
                }
                if(ss.equals("Sanmenxia"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        sn);
                }

                if(ss.equals("Leshan"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        le);
                }
                if(ss.equals("Chengdu"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ce);
                }
                if(ss.equals("Yaan"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ya);
                }

                if(ss.equals("Baoding"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        bo);
                }
                if(ss.equals("Xingtai"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        xi);
                }
                if(ss.equals("Langfang"))
                {a11=new ArrayAdapter<String>(
                        getApplicationContext(),
                        android.R.layout.simple_spinner_item,
                        ln);
                }
                a11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                s4.setAdapter(a11);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext()
                        ,"Country: "+s1.getSelectedItem().toString() +
                                ", State: "+s2.getSelectedItem().toString() +
                                ", City: "+s3.getSelectedItem().toString() +
                                ", Area: "+s4.getSelectedItem().toString(),
                        Toast.LENGTH_SHORT).show();

            }
        });



    }
}