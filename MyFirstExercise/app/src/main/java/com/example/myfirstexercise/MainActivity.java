package com.example.myfirstexercise;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView_title = findViewById(R.id.title);
        textView_title.setPaintFlags(textView_title.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }
}