package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class Class5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class5);
        RatingBar rb =(RatingBar)findViewById(R.id.rat3);
        rb.setEnabled(true);
        rb.setNumStars(5);
    }
}
