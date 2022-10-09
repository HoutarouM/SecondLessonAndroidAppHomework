package com.example.secondlessonhomeworkexercisetwo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomNumber(View view) {
        int randomNumber = (int) (Math.random() * 100);

        TextView textView = (TextView) findViewById(R.id.text_view);

        textView.setText(Integer.toString(randomNumber));
    }
}