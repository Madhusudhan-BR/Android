package com.example.madhusudhanbr.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    int num1=-1;
    int num2=-1;
    int result;
    String operator = "";

    TextView output = (TextView) findViewById(R.id.textView3);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(num1 == -1) {
//                    num1 = 1;
//                } else {
//                    num2 = 1;
//                }

                if(operator == "") {
                    num1 = 1;
                    output.setText(num1);
                } else {
                    num2 = 1;
                    output.setText(num1 + operator + num2);
                }

            }
        });


        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator == "") {
                    num1 = 2;
                } else {
                    num2 = 2;
                    output.setText(num1 + operator + num2);
                }

            }
        });

        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator == "") {
                    num1 = 3;
                } else {
                    num2 = 3;
                    output.setText(num1 + operator + num2);
                }

            }
        });

        Button four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator == "") {
                    num1 = 4;
                } else {
                    num2 = 4;
                    output.setText(num1 + operator + num2);
                }

            }
        });

        Button five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator == "") {
                    num1 = 5;
                } else {
                    num2 = 5;

                }

            }
        });

        Button six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator == "") {
                    num1 = 6;
                } else {
                    num2 = 6;
                }

            }
        });

        Button sev = (Button) findViewById(R.id.button7);
        sev.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator == "") {
                    num1 = 7;
                } else {
                    num2 = 7;
                }

            }
        });

        Button eight = (Button) findViewById(R.id.button8);
        eight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator == "") {
                    num1 = 8;
                } else {
                    num2 = 8;
                }

            }
        });

        Button nine = (Button) findViewById(R.id.button9);
        nine.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator == "") {
                    num1 = 9;
                } else {
                    num2 = 9;
                }

            }
        });

        Button zero = (Button) findViewById(R.id.button10);
        zero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator == "") {
                    num1 = 0;
                } else {
                    num2 = 0;
                }

            }
        });

        Button plus = (Button) findViewById(R.id.button11);
        plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
               operator = "+";

            }
        });

        Button minus = (Button) findViewById(R.id.button12);
        minus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "-";

            }
        });

        Button mul = (Button) findViewById(R.id.button13);
        mul.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "*";

            }
        });

        Button div = (Button) findViewById(R.id.button14);
        div.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "/";

            }
        });

        Button perc = (Button) findViewById(R.id.button15);
        plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "%";

            }
        });

        Button ac = (Button) findViewById(R.id.button16);
        ac.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear

            }
        });

        Button eq = (Button) findViewById(R.id.button17);
        eq.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }


}
