package com.example.gujjutastic;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;


public class SignTabFragment extends Fragment implements View.OnClickListener {

    EditText mobsign,passwordsign,consign;
    Button btn1;
    /* float v; */

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            ViewGroup root = (ViewGroup) inflater.inflate(R.layout.sign_up_tab_fragment, container, false);
            mobsign = root.findViewById(R.id.mobilesign);
            passwordsign = root.findViewById(R.id.passsign);
            consign = root.findViewById(R.id.conpass);
            btn1 = root.findViewById(R.id.button1);
            btn1.setOnClickListener(this);
            return root;
        }


    @Override
    public void onClick(View view) {
        if(view == btn1){
            Intent btn = new Intent(SignTabFragment.this.getActivity(),splashscreen.class);
            startActivity(btn);
        }
    }
}

