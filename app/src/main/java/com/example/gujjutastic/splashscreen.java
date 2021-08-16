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

public class splashscreen extends AppCompatActivity implements View.OnClickListener {

    TextView title,sol;
    Button dev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        title = findViewById(R.id.textView);
        sol = findViewById(R.id.solgn);
        dev = findViewById(R.id.button2);
        dev.setOnClickListener(this);

        title.animate().alpha(0f).setDuration(0);
        sol.animate().alpha(0f).setDuration(0);
        dev.animate().alpha(0f).setDuration(0);

        dev.animate().alpha(1f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                title.animate().alpha(1f).setDuration(800);
                sol.animate().alpha(1f).setDuration(800);
                dev.animate().alpha(1f).setDuration(800);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view == dev){
            Intent get = new Intent(splashscreen.this, firstpage.class);
            startActivity(get);
        }
    }
}
