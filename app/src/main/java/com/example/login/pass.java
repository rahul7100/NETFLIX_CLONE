package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        Button bt=(Button)findViewById(R.id.bt3);
    }public void onclick14(View v){
        Intent it= new Intent(this,feed.class);
        startActivity(it);
    }
}
