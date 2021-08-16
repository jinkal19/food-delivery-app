package com.example.gujjutastic;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment implements View.OnClickListener {

    EditText mobile,password;
    TextView forget;
    Button  btn;
    float v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);


        mobile = root.findViewById(R.id.mobilenum);
        password = root.findViewById(R.id.pass);
        forget = root.findViewById(R.id.forget_pass);
        btn = root.findViewById(R.id.button);
        btn.setOnClickListener(this);

        mobile.setTranslationY(800);
        password.setTranslationY(800);
        forget .setTranslationY(800);
        btn.setTranslationY(800);


        mobile.setAlpha(v);
        password.setAlpha(v);
        forget.setAlpha(v);
        btn.setAlpha(v);

        mobile.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forget.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btn.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;

    }


    @Override
    public void onClick(View view) {
        if(view == btn){
        Intent btn1 = new Intent(LoginTabFragment.this.getActivity(),splashscreen.class);
        startActivity(btn1);
    }
    }
}
