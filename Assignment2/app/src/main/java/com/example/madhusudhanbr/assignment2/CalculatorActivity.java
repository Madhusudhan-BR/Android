package com.example.madhusudhanbr.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {


    String temp;
    Double lhs = 0.0;
    Double rhs = 0.0;
    Double result;
    String operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        final TextView textView = (TextView) findViewById(R.id.textView3);

        Button one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "1";
                textView.setText(temp);

            }
        });

        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "2";
                textView.setText(temp);

            }
        });

        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "3";
                textView.setText(temp);

            }
        });

        Button four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "4";
                textView.setText(temp);

            }
        });

        Button five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "1";
                textView.setText(temp);

            }
        });

        Button six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "6";
                textView.setText(temp);

            }
        });

        Button seven = (Button) findViewById(R.id.button7);
        seven.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "7";
                textView.setText(temp);

            }
        });

        Button eight = (Button) findViewById(R.id.button8);
        eight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "8";
                textView.setText(temp);

            }
        });

        Button nine = (Button) findViewById(R.id.button9);
        nine.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "9";
                textView.setText(temp);

            }
        });

        Button zero = (Button) findViewById(R.id.button10);
        zero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = (String) textView.getText();
                temp = temp + "0";
                textView.setText(temp);

            }
        });

        Button plus = (Button) findViewById(R.id.button11);
        plus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                lhs = Double.parseDouble((String) textView.getText());
                operator = "+";
                textView.setText("");

            }
        });

        Button minus = (Button) findViewById(R.id.button12);
        minus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                lhs = Double.parseDouble((String) textView.getText());
                operator = "-";
                textView.setText("");

            }
        });

        Button mul = (Button) findViewById(R.id.button13);
        mul.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                lhs = Double.parseDouble((String) textView.getText());
                operator = "*";
                textView.setText("");

            }
        });

        Button div = (Button) findViewById(R.id.button14);
        div.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                lhs = Double.parseDouble((String) textView.getText());
                operator = "/";
                textView.setText("");

            }
        });

        Button perc = (Button) findViewById(R.id.button15);
        perc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                lhs = Double.parseDouble((String) textView.getText());
                operator = "%";
                textView.setText("");

            }
        });

        Button ac = (Button) findViewById(R.id.button16);
        ac.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                lhs = 0.0;
                rhs = 0.0;
                operator = "";

            }
        });

        Button eq = (Button) findViewById(R.id.button17);
        eq.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rhs = Double.parseDouble((String) textView.getText());

                switch (operator){
                    case "+" : result = lhs + rhs;
                        break;
                    case "-" : result = lhs-rhs;
                        break;
                    case "*" : result = lhs*rhs;
                        break;
                    case "/" : result = lhs/rhs;
                        break;
                    case "%" : result = lhs%rhs;
                        break;
                    default: return;
                }
                Toast.makeText(getApplicationContext(), "lhs" + lhs + "rhs" + rhs + "operator" + operator , Toast.LENGTH_LONG).show();
                textView.setText(Double.toString(result));
                lhs = result;
                rhs = 0.0;

            }
        });

    }
}
