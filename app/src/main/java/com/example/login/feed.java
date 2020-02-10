package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        Button button=(Button)findViewById(R.id.btn1);

        Button button1=(Button)findViewById(R.id.btn2);
        Button button3=(Button)findViewById(R.id.btn3);
        Button button4=(Button)findViewById(R.id.btn4);
        Button button5=(Button)findViewById(R.id.btn5);
        Button button6=(Button)findViewById(R.id.btn6);
        Button button7=(Button)findViewById(R.id.btn7);
        Button button8=(Button)findViewById(R.id.btn8);
        Button button9=(Button)findViewById(R.id.btn9);
        Button button10=(Button)findViewById(R.id.btn10);
    }
    public void onClick(View view){
        Intent i= new Intent(feed.this,Class1.class);
        startActivity(i);
    }
    public void onClick2(View view){
        Intent i= new Intent(feed.this,Class2.class);
        startActivity(i);
    }
    public void onClick3(View view){
        Intent i= new Intent(feed.this,Class3.class);
        startActivity(i);
    }
    public void onClick4(View view){
        Intent i= new Intent(feed.this,Class4.class);
        startActivity(i);
    }
    public void onClick5(View view){
        Intent i= new Intent(feed.this,Class5.class);
        startActivity(i);
    }
    public void onClick6(View view){
        Intent i= new Intent(feed.this,Class6.class);
        startActivity(i);
    }
    public void onClick7(View view){
        Intent i= new Intent(feed.this,Class7.class);
        startActivity(i);
    }
    public void onClick8(View view){
        Intent i= new Intent(feed.this,Class8.class);
        startActivity(i);
    }
    public void onClick9(View view){
        Intent i= new Intent(feed.this,Class9.class);
        startActivity(i);
    }
    public void onClick10(View view){
        Intent i= new Intent(feed.this,Class10.class);
        startActivity(i);
    }
}

