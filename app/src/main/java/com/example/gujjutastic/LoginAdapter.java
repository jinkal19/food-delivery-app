package com.example.gujjutastic;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totaltabs;

    public LoginAdapter(FragmentManager fm, Context context, int totaltabs){
        super(fm);
        this.context = context;
        this.totaltabs = totaltabs;
    }
    @Override
    public int getCount() {
        return totaltabs;
    }

    public Fragment getItem(int position) {
        switch (position){
            case 0:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;
            case 1:
                SignTabFragment signTabFragment = new SignTabFragment();
                return signTabFragment;
            default:
                return null;
        }
    }
}