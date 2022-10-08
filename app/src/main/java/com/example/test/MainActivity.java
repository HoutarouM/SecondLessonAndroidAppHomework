package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSize(View view) {
        TextView textView = (TextView) findViewById(R.id.text_view);

        float textSize = textView.getTextSize();

        textSize += textSize * 1.1f;

        textView.setTextSize(textSize);
    }

    public void removeSize(View view) {
        TextView textView = (TextView) findViewById(R.id.text_view);

        float textSize = textView.getTextSize();

        textSize -= textSize / 1.1f;

        textView.setTextSize(textSize);
    }
}