package com.example.amitmutreja.recyclerviewexample.views.activities;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.amitmutreja.recyclerviewexample.R;
import com.example.amitmutreja.recyclerviewexample.views.fragments.LearnFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            LearnFragment learnFragment = new LearnFragment();
            fragmentTransaction.replace(R.id.learn_fragment_container, learnFragment).commit();
        }
    }
}
