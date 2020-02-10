package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class Class4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class4);
        RatingBar rb =(RatingBar)findViewById(R.id.rat2);
        rb.setEnabled(false);
        rb.setNumStars(4);

    }
}
