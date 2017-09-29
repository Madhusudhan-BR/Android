package com.example.madhusudhanbr.assignment4;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        RecyclerViewFragment fragment1 = new RecyclerViewFragment();
        fragmentTransaction.add(R.id.container_recyclerViewFragment,fragment1);
        fragmentTransaction.commit();
    }
}
