package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    public void changeTextColorOnRed(View view) {
        Button b = (Button) findViewById(R.id.button_red);

        Drawable color = (Drawable) b.getBackground();

        findViewById(R.id.background).setBackground(color);
    }

    public void changeTextColorOnBlue(View view) {
        Button b = (Button) findViewById(R.id.button_blue);

        Drawable color = (Drawable) b.getBackground();

        findViewById(R.id.background).setBackground(color);
    }

    public void changeTextColorOnYellow(View view) {
        Button b = (Button) findViewById(R.id.button_yellow);

        Drawable color = (Drawable) b.getBackground();

        findViewById(R.id.background).setBackground(color);
    }

    public void changeTextColorOnGreen(View view) {
        Button b = (Button) findViewById(R.id.button_green);

        Drawable color = (Drawable) b.getBackground();

        findViewById(R.id.background).setBackground(color);
    }
}