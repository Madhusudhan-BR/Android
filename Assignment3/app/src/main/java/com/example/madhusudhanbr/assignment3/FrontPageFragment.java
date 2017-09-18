package com.example.madhusudhanbr.assignment3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FrontPageFragment extends Fragment {

    public interface CustomOnClickListerner {
        public void onClicked(View view);
    }

    Button aboutMeButton;
    Button viewPagerButton;
    Button masterDetailButton;
    private CustomOnClickListerner customOnClickListerner;



    public FrontPageFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_front_page, container, false);


        aboutMeButton = (Button) view.findViewById(R.id.button2);
        viewPagerButton = (Button) view.findViewById(R.id.button3);
        masterDetailButton = (Button) view.findViewById(R.id.button4);

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    buttonClicked(v);
            }
        });

        viewPagerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        masterDetailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return view;
    }


    public  void buttonClicked(View v) {
        customOnClickListerner.onClicked(v);
    }
    @Override
    @Deprecated
    public void onAttach ( Activity activity ) {
        super .onAttach(activity);
        customOnClickListerner = (CustomOnClickListerner) activity ;
    }
}
