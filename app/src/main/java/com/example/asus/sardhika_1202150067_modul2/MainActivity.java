package com.example.asus.sardhika_1202150067_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup c;
    private RadioButton d,e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = (RadioGroup) findViewById(R.id.action);
        Intent c =getIntent();
    }



    public void onButtonClicked(View view) {
        int selected = c.getCheckedRadioButtonId();
        d = (RadioButton) findViewById(R.id.dine);
        e = (RadioButton) findViewById(R.id.take);

        if (selected == d.getId()) {
            Intent intent = new Intent(MainActivity.this, DineIn.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Dine In!", Toast.LENGTH_LONG).show();

        } else if (selected == e.getId()) {
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Take Away!", Toast.LENGTH_LONG).show();


        }
    }
}
