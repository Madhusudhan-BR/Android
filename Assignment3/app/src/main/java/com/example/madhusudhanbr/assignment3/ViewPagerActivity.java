package com.example.madhusudhanbr.assignment3;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import java.util.HashMap;
import java.util.Locale;

public class ViewPagerActivity extends AppCompatActivity {

    MovieData myMovieData = new MovieData();
    //private static final int NUM_PAGES = 25;
    private ViewPager mViewpager;
    private PagerAdapter mPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        MovieFragment fragment1 = new MovieFragment();
//        fragmentTransaction.add(R.id.movie_fragment_container,fragment1);
//        fragmentTransaction.commit();


        // Instantiate a ViewPager and a PagerAdapter.
        mViewpager = (ViewPager) findViewById(R.id.pager);
        mPageAdapter = new ViewPagerActivityAdapter(getSupportFragmentManager(),myMovieData.getSize());
        mViewpager.setAdapter(mPageAdapter);
        mViewpager.setCurrentItem(0);
        mViewpager.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View page, float position) {
                final float normalized_position = Math.abs(Math.abs(position) - 1);
                page.setScaleX(normalized_position/ 2 + 0.5f);
                page.setScaleY(normalized_position/ 2 + 0.5f);
            }
        });

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabbed);
        tabLayout.setupWithViewPager(mViewpager);

    }

//    @Override
//    public void onBackPressed() {
//        if (mViewpager.getCurrentItem() == 0) {
//            // If the user is currently looking at the first step, allow the system to handle the
//            // Back button. This calls finish() on this activity and pops the back stack.
//            super.onBackPressed();
//        } else {
//            // Otherwise, select the previous step.
//            mViewpager.setCurrentItem(mViewpager.getCurrentItem() - 1);
//        }
//    }

    private class ViewPagerActivityAdapter extends FragmentStatePagerAdapter {

        int count;

        public ViewPagerActivityAdapter(FragmentManager fm,int size) {
            super(fm);
            count = size;
        }

        @Override
        public Fragment getItem(int position) {
            return MovieFragment.newInstance((HashMap<String,?>)myMovieData.getItem(position));
        }

        @Override
        public int getCount() {
            return count;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            HashMap<String, ? > movie = (HashMap<String, ? >) myMovieData.getItem(position);
            String name = movie.get("title").toString();
            return name.toUpperCase();
        }
    }
}
