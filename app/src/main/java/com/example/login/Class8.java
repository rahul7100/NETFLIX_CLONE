package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class Class8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class8);
        RatingBar rb =(RatingBar)findViewById(R.id.rat6);
        rb.setEnabled(true);
        rb.setNumStars(5);
    }
}
