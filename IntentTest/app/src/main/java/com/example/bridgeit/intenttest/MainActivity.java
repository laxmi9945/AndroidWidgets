package com.example.bridgeit.intenttest;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);


    }
    public void dial(View view){
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        startActivity(intent);
    }



    public void explicit(View v) {
            Intent intent2=new Intent();

            intent2.setComponent(new ComponentName(getApplicationContext(),Activity2.class));
            startActivity(intent2);
        }
    }

