package com.prpt.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    long n=0;

    Button zero, one, two, three,
            four, five, six, seven,
            eight, nine, add, mul,
            div, sub, bracket1, bracket2,
            dzero, parcentage, allclear, equal, point;

    ImageView power, backspace;

    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.b1);
        two=findViewById(R.id.b2);
        three=findViewById(R.id.b3);
        four=findViewById(R.id.b4);
        five=findViewById(R.id.b5);
        six=findViewById(R.id.b6);
        seven=findViewById(R.id.b7);
        eight=findViewById(R.id.b8);
        nine=findViewById(R.id.b9);
        zero=findViewById(R.id.b10);
        dzero=findViewById(R.id.b11);
        point=findViewById(R.id.b12);
        equal=findViewById(R.id.b13);
        add=findViewById(R.id.b14);
        sub=findViewById(R.id.b15);
        mul=findViewById(R.id.b16);
        div=findViewById(R.id.b17);
        parcentage=findViewById(R.id.b18);
        allclear=findViewById(R.id.b20);
        display=findViewById(R.id.text1);



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n)+1;
                display.setText(" "+n);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n)+2;
                display.setText(" "+n);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n)+3;
                display.setText(" "+n);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n)+4;
                display.setText(" "+n);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n)+5;
                display.setText(" "+n);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n)+6;
                display.setText(" "+n);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n)+7;
                display.setText(" "+n);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n)+8;
                display.setText(" "+n);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n)+9;
                display.setText(" "+n);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(10*n);
                display.setText(" "+n);
            }
        });
        dzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=(100*n);
                display.setText(" "+n);
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        parcentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        allclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}