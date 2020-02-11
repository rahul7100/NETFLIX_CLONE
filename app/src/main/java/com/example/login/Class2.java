package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;

public class Class2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2);
        RatingBar rb =(RatingBar)findViewById(R.id.nfrating);
        rb.setEnabled(true);
        rb.setNumStars(3);
    }
}
