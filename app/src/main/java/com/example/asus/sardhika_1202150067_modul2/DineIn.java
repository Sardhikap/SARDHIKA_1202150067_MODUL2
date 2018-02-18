package com.example.asus.sardhika_1202150067_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DineIn extends AppCompatActivity {
Button pilih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        pilih =(Button) findViewById(R.id.pesand);
        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(DineIn.this, DaftarMenu.class);
                startActivity(a);
            }
                                 }

        );
    }
}
