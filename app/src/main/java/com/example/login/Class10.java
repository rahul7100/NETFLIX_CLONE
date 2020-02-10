package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class Class10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class10);
        RatingBar s =(RatingBar)findViewById(R.id.rat9);
        s.setEnabled(false);
        s.setNumStars(5);
    }
}
