package com.example.gujjutastic;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView name_app,solgan_app;
    ImageView icon;
    Button get_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_app = findViewById(R.id.app_name);
        solgan_app = findViewById(R.id.app_solgan);
        icon = findViewById(R.id.app_icon);
        get_start = findViewById(R.id.btn_get);
        get_start.setOnClickListener(this);

        name_app.animate().alpha(0f).setDuration(0);
        solgan_app.animate().alpha(0f).setDuration(0);
        icon.animate().alpha(0f).setDuration(0);
        get_start.animate().alpha(0f).setDuration(0);

        icon.animate().alpha(1f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                name_app.animate().alpha(1f).setDuration(800);
                solgan_app.animate().alpha(1f).setDuration(800);
                get_start.animate().alpha(1f).setDuration(800);
            }
        });

    }

    @Override
    public void onClick(View view) {
        if(view == get_start){
            Intent get_start = new Intent(MainActivity.this, Login_page.class);
            startActivity(get_start);
        }
    }
}