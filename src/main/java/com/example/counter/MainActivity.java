package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView textView;
    int counter= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
    }

    public void increase(View view) {
        counter++;
        textView.setText(""+counter);

    }
    public void decrease(View view) {
        counter--;
        textView.setText(""+counter);
    }

    public void Reset(View view) {
        counter=0;
        textView.setText(""+counter);
    }
}