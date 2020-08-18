package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText et1, et2;
    TextView textv;
    String num1, num2;
    int no1, no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et1 = findViewById(R.id.n1);
        et2 = findViewById(R.id.n2);
        textv = findViewById(R.id.tv3);

        Intent intent = getIntent();
        num1  = intent.getStringExtra("no1");
        num2 = intent.getStringExtra("no2");

        et1.setText(num1);
        et2.setText(num2);

        no1 = Integer.parseInt(num1);
        no2 = Integer.parseInt(num2);
    }

    public void add(View view){
        textv.setText(num1 + " + " + num2 + " = " + (no1+no2));
    }

    public void multiply(View view){
        textv.setText(num1 + " x " + num2 + "=" + (no1*no2));
    }

    public void substract(View view){
        textv.setText(num1 + " - " + num2 + " = " + (no1-no2));
    }

    public void divide(View view){
        textv.setText(num1 + " / " + num2 + " = " + (no1/no2));
    }
}