package com.send_receive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText Input_1, Input_2;
    Button button1, button2;
    Integer  total;
    TextView output;
    int oo, tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input_1 = findViewById(R.id.Input_1);
        Input_2 = findViewById(R.id.Input_2);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        output = findViewById(R.id.Output);
        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String ss = Input_1.getText().toString();
                int oo = Integer.parseInt(ss);
                String uu = Input_2.getText().toString();
                int tt = Integer.parseInt(uu);
                total = oo + tt ;
                output.setText(total.toString());

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                String ss = Input_1.getText().toString();
                oo = Integer.parseInt(ss);
                String uu = Input_2.getText().toString();
                tt = Integer.parseInt(uu);
                intent.putExtra("key1", oo);
                intent.putExtra("key2", tt);
                intent.putExtra("key3", total);

                startActivity(intent);

            }
        });

    }
}