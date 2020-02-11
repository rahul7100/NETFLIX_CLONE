package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class Class7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class7);
        RatingBar rb =(RatingBar)findViewById(R.id.rat5);
        rb.setEnabled(true);
        rb.setNumStars(3);

    }
}
