package com.example.bridgeit.myfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    FragmentManager fragmentManager;
    FragmentTransaction tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn1);
        button=(Button)findViewById(R.id.btn2);
        button=(Button)findViewById(R.id.btn3);
        button=(Button)findViewById(R.id.btn4);
       fragmentManager=getFragmentManager();
    }

    public void FragOne(View view){
        tx=fragmentManager.beginTransaction();
        tx.replace(R.id.frame,new FragmentOne());
        tx.commit();
    }
    public void FragTwo(View view){
        tx=fragmentManager.beginTransaction();
        tx.replace(R.id.frame,new FragmentTwo());
        tx.commit();
    }
    public void FragThree(View view){
        tx=fragmentManager.beginTransaction();
        tx.replace(R.id.frame,new FragmentThree());
        tx.commit();

    }
    public void FragFour(View view){
        tx=fragmentManager.beginTransaction();
        tx.replace(R.id.frame,new FragmentFour());
        tx.commit();
    }
}
