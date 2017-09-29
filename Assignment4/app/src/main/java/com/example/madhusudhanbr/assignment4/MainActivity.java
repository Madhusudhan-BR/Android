package com.example.madhusudhanbr.assignment4;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity implements FrontPageFragment.CustomOnClickListerner {

    @Override
    public void onClicked(View view) {

        switch (view.getId()){

            case R.id.button2 : FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                AboutMeFragment fragment2 = new AboutMeFragment();
                fragmentTransaction.replace(R.id.container,fragment2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                break;

            case R.id.button3:

                Intent intent = new Intent(this, RecyclerViewActivity.class);
                startActivity(intent);

                break;


            default:
                break;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar my_toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FrontPageFragment fragment1 = new FrontPageFragment();
        fragmentTransaction.add(R.id.container,fragment1);
        fragmentTransaction.commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu );
        return true ;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item ) {
        switch (item.getItemId()) {

            case R.id.action_one :

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                AboutMeFragment fragment2 = new AboutMeFragment();
                fragmentTransaction.replace(R.id.container,fragment2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();



                return true ;

            case R.id.action_two :

                Intent intent = new Intent(this, RecyclerViewActivity.class);
                startActivity(intent);

                return true ;
//
//            case R.id.action_three: Intent indent = new Intent(MainActivity.this, MasterDetailActivity.class);
//
//                startActivity(indent);
//
//
//
//                return true;

            default :

                return super.onOptionsItemSelected(item);
        }
    }
}
