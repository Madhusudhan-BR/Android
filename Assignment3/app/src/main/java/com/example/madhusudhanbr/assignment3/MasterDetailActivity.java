package com.example.madhusudhanbr.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;

public class MasterDetailActivity extends AppCompatActivity implements MasterDetailFragment.CustomListerner {

    private boolean mTwoPane;
    MovieData myMovieData = new MovieData();
    int count = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_detail);

        if(findViewById(R.id.detail_container) != null) {
            mTwoPane = true;
        }

        //MasterDetailFragment fragment1 = new MasterDetailFragment();

        setCount(count);
        getSupportFragmentManager().beginTransaction().add(R.id.main_container, MasterDetailFragment.newInstance(count))
                .commit();

    }

    public void setCount(int counter) {
        count = counter;

        if(count == -1) {
            count = 0;
        }

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
