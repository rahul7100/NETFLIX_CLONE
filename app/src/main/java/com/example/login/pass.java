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
        Button bt1=(Button)findViewById(R.id.bt4);
    }

    public void onclick15(View v){
        Intent it= new Intent(this,signup.class);
        startActivity(it);
    }
    public void onclick16(View v){
        Intent i= new Intent(this,feed.class);
        startActivity(i);
    }

}
