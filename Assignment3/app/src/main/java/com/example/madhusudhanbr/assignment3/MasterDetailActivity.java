package com.example.madhusudhanbr.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;

public class MasterDetailActivity extends AppCompatActivity implements MasterDetailFragment.CustomListerner {

    private boolean mTwoPane;
    MovieData myMovieData = new MovieData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_detail);

        if(findViewById(R.id.detail_container) != null) {
            mTwoPane = true;
        }

        MasterDetailFragment fragment1 = new MasterDetailFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.main_container,fragment1)
                .commit();

    }

    @Override
    public void clicked(View view, int count) {
        HashMap<String, ?> movie = myMovieData.getItem(count);
        if(mTwoPane){
            getSupportFragmentManager().beginTransaction().replace(R.id.detail_container,MovieFragment.newInstance(movie))
            .addToBackStack(null)
            .commit();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_container,MovieFragment.newInstance(movie))
                    .addToBackStack(null)
                    .commit();
        }

    }
}
