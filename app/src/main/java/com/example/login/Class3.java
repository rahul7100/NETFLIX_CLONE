package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class Class3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class3);
        RatingBar rb =(RatingBar)findViewById(R.id.rat1);
        rb.setEnabled(true);
        rb.setNumStars(3);
    }
}
