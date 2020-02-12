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
        Button bt1=(Button)findViewById(R.id.bt4);

    }
    public void onclick12(View v){
        Intent it= new Intent(this,pass.class);
        startActivity(it);
    }
    public void onclick13(View v){
        Intent t= new Intent(this,MainActivity.class);
        startActivity(t);
    }
}
