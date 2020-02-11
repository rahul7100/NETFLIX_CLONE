package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button bt=(Button)findViewById(R.id.bt3);

    }
    public void onclick12(View v){
        Intent it= new Intent(this,pass.class);
        startActivity(it);
    }
}
