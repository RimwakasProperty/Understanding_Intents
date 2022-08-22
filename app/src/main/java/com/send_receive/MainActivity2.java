package com.send_receive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Input_1, Input_2, Output;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Input_1 = findViewById(R.id.input1);
        Input_2 = findViewById(R.id.input2);
        Output = findViewById(R.id.output);
        Intent intent = getIntent();
        int first = intent.getIntExtra("key1", 0);
        int second = intent.getIntExtra("key2", 0);
        int third = intent.getIntExtra("key3", 0);

        Input_1.setText(Integer.toString(first));
        Input_2.setText(Integer.toString(second));
        Output.setText(Integer.toString(third));
    }
}