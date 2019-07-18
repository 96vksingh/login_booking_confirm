package com.example.login_booking_confirm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText user,pass;
    private Button logg;
    public String u,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=findViewById(R.id.editText);
        pass=findViewById(R.id.editText2);
        logg=findViewById(R.id.button);

        logg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                u=user.getText().toString();
                p=pass.getText().toString();
                if(u.equals("vk") && p.equals("123456")){
                    Intent to_order = new Intent(getBaseContext(), order.class);
                    startActivity(to_order);
                }
            }
        });
    }
}
