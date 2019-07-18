package com.example.login_booking_confirm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class order extends AppCompatActivity {

    private Button oo,sta_o,main_o;
    private CheckBox s_1,s_2,s_3,m_1,m_2,m_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        sta_o=findViewById(R.id.button2);
        main_o=findViewById(R.id.button3);
        oo=findViewById(R.id.button4);

        s_1=findViewById(R.id.checkBox);
        s_2=findViewById(R.id.checkBox2);
        s_3=findViewById(R.id.checkBox3);
        m_1=findViewById(R.id.checkBox4);
        m_2=findViewById(R.id.checkBox5);
        m_3=findViewById(R.id.checkBox6);

        m_3.setClickable(false);
        m_2.setClickable(false);
        m_1.setClickable(false);
        s_1.setClickable(false);
        s_2.setClickable(false);
        s_3.setClickable(false);

    }
}
