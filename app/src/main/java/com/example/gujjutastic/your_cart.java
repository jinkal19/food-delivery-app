package com.example.gujjutastic;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class your_cart extends AppCompatActivity {


    private TextView HeadTxt, Txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_cart);

        HeadTxt = findViewById(R.id.textView1);
        Txt = findViewById(R.id.textView2);

    }
}






