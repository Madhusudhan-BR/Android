package com.example.madhusudhanbr.assignment2;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.view.View;

public class MovieList extends AppCompatActivity {

    MovieData myData = new MovieData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);



        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        TextView idView = (TextView) findViewById(R.id.textView4);
        TextView titleView = (TextView) findViewById(R.id.textView6);
        TextView descView = (TextView) findViewById(R.id.textView8);
        TextView releaseView = (TextView) findViewById(R.id.textView10);
        TextView voteView = (TextView) findViewById(R.id.textView12);

        TextView id = (TextView) findViewById(R.id.textView5);
        TextView title = (TextView) findViewById(R.id.textView7);
        TextView desc = (TextView) findViewById(R.id.textView9);
        TextView release = (TextView) findViewById(R.id.textView11);
        TextView vote = (TextView) findViewById(R.id.textView13);
        final ImageView image = (ImageView) findViewById(R.id.imageView2);

        idView.setText("ID");
        titleView.setText("Title");
        descView.setText("Description");
        releaseView.setText("Release date");
        voteView.setText("Votes");



//        HashMap movie = myData.getItem(0);
//        String tit = movie.get("title").toString();
//        title.setText(tit);
//        id.setText(movie.get("id").toString());
        //readMovie(0);
        seekBar.setMax(10);
        seekBar.setProgress(5);

        ViewGroup.LayoutParams params = image.getLayoutParams();
        params.height = 300;
        params.width = 300;

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                image.getLayoutParams().width = progress*100;
                image.getLayoutParams().height = progress*100;
                image.requestLayout();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        readMovie(0);
        findViewById(R.id.activity_movie_list).setOnTouchListener(new View.OnTouchListener(){

            double downX;
            double downY;
            int index = 0;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                         downX = event.getX();
                         downY = event.getY();
                        break;
                    case MotionEvent.ACTION_MOVE :
                        double deltaX = downX - event.getX();
                        double deltaY = downY - event.getY();

                        if(deltaX < 0) {
                            //goes rifht swipe left
                            index = index - 1;
                            if(index >= 0 && index <=24) {
                                readMovie(index);
                            } else {
                                index = index + 1;
                            }

                        }

                        if(deltaX>0) {
                            //goes left swipe right
                            index = index + 1;
                            if(index >= 0 && index <=24) {
                                readMovie(index);
                            } else {
                                index = index - 1;
                            }

                        }

                }
                return true;
            }
        });

        



    }


    private void readMovie(int index){

        TextView id = (TextView) findViewById(R.id.textView5);
        TextView title = (TextView) findViewById(R.id.textView7);
        TextView desc = (TextView) findViewById(R.id.textView9);
        TextView release = (TextView) findViewById(R.id.textView11);
        TextView vote = (TextView) findViewById(R.id.textView13);
        ImageView image = (ImageView) findViewById(R.id.imageView2);

        HashMap movie = myData.getItem(index);
        //System.out.println(movie);
        //Toast.makeText(getApplicationContext(),movie.get("title").toString(),Toast.LENGTH_LONG).show();
        title.setText(movie.get("title").toString());
           id.setText(movie.get("id").toString());
        desc.setText(movie.get("overview").toString());
        image.setImageResource((int)movie.get( "image"));
        vote.setText(movie.get("voteCount").toString());
        release.setText(movie.get("release").toString());
    }
}
