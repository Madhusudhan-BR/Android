package com.example.madhusudhanbr.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
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
                Intent calculatorIntent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(calculatorIntent);
                return true ;

            case R.id.action_two :
                Intent linearLayoutIntent = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(linearLayoutIntent);
                return true ;

            case R.id.action_three:
                Intent movieListIntent = new Intent(MainActivity.this, MovieList.class);
                startActivity(movieListIntent);
                return true;

            default :

                return super.onOptionsItemSelected(item);
        }
    }
}