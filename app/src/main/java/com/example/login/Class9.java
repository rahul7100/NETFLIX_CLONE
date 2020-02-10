package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class Class9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class9);
        RatingBar rb =(RatingBar)findViewById(R.id.rat7);
        rb.setEnabled(false);
        rb.setNumStars(3);
    }
}
