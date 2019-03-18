package com.dicoding.dennylim.myflexiblefragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager myFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = myFragmentManager.beginTransaction();
        HomeFragment homeFragment = new HomeFragment();

        Fragment fragment = myFragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());
        if(!(fragment instanceof HomeFragment))
        {
            mFragmentTransaction.add(R.id.frame_layout, homeFragment, HomeFragment.class.getSimpleName());
            Log.d("MyFlexibleFragment", "Fragment Name :" + HomeFragment.class.getSimpleName());
            mFragmentTransaction.commit();
        }
    }
}
