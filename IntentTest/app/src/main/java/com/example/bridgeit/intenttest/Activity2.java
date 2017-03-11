package com.example.bridgeit.intenttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by bridgeit on 11/3/17.
 */

public class Activity2 extends AppCompatActivity
{
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutsecond);
            button=(Button)findViewById(R.id.bk);
        button=(Button)findViewById(R.id.wp);
    }
    public void back(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }
    public void whatsapp(View view){
        Intent intent=getPackageManager().getLaunchIntentForPackage("");
    }
}
