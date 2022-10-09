package com.example.secondlessonhomeworkexercisethree;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wrongAnswer(View view) {
        Toast.makeText(MainActivity.this, R.string.wrong_answer, Toast.LENGTH_LONG).show();
    }

    public void correctAnswer(View view) {
        Toast.makeText(MainActivity.this, R.string.correct_answer, Toast.LENGTH_LONG).show();
    }
}