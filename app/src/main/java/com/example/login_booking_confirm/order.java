package com.example.login_booking_confirm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class order extends AppCompatActivity {

    private Button oo,sta_o,main_o;
    private CheckBox s_1,s_2,s_3,m_1,m_2,m_3;
    int flag_s=0,flag_m=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        sta_o=findViewById(R.id.button2);
        main_o=findViewById(R.id.button3);
        oo=findViewById(R.id.button4);

        s_1=findViewById(R.id.checkBox6);
        s_2=findViewById(R.id.checkBox2);
        s_3=findViewById(R.id.checkBox);
        m_1=findViewById(R.id.checkBox3);
        m_2=findViewById(R.id.checkBox4);
        m_3=findViewById(R.id.checkBox5);

        m_3.setClickable(false);
        m_2.setClickable(false);
        m_1.setClickable(false);
        s_1.setClickable(false);
        s_2.setClickable(false);
        s_3.setClickable(false);

        sta_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                flag_s=1;
                flag_m=0;

                s_1.setClickable(true);
                s_2.setClickable(true);
                s_3.setClickable(true);
                if(m_3.isChecked()){
                    m_3.toggle();

                }
                if(m_2.isChecked()){
                    m_2.toggle();

                }
                if(m_1.isChecked()){
                    m_1.toggle();

                }
                m_3.setClickable(false);
                m_2.setClickable(false);
                m_1.setClickable(false);

            }
        });

        main_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                flag_s=0;
                flag_m=1;

                m_3.setClickable(true);
                m_2.setClickable(true);
                m_1.setClickable(true);

                if(s_3.isChecked()){
                    s_3.toggle();

                }
                if(s_2.isChecked()){
                    s_2.toggle();

                }
                if(s_1.isChecked()){
                    s_1.toggle();

                }
                s_1.setClickable(false);
                s_2.setClickable(false);
                s_3.setClickable(false);


            }
        });

        oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(flag_s==1){
                    flag_s=0;
                    Toast.makeText(getApplicationContext(),"starters",Toast.LENGTH_SHORT).show();


                }

                if(flag_m==1){
                    flag_m=0;

                    Toast.makeText(getApplicationContext(),"main course",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
