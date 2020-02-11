package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.bt1);
        EditText eT = (EditText)findViewById(R.id.et1);
        EditText eT1=(EditText)findViewById(R.id.et2);
        Button b1=(Button)findViewById(R.id.bt2);
    }

    public void onclick1(View v){
        Intent i=new Intent(this,feed.class);
        startActivity(i);

    }
    public void onclick11(View v){
        Intent t= new Intent(this,signup.class);
        startActivity(t);
    }
}
