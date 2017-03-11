package com.example.bridgeit.widgettest2;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.sip.SipAudioCall;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn,button2,button3;
    Spinner spin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn1);
        button2=(Button)findViewById(R.id.btn2);
        button3=(Button)findViewById(R.id.btn3);
        spin = (Spinner) findViewById(R.id.spinner);
        //String[] str = {"Male", "female", "Other"};
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.gender,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Datepicker.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Timepicker.class);
                startActivity(intent);
            }
        });
    }

    public void button(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Oh No! Do u really want to close ?");
        builder.setPositiveButton("Ok", null);
        builder.setNegativeButton("No", null);
        builder.setNeutralButton("Not Now", null);
        AlertDialog alert = builder.create();
        alert.setTitle("Dialog Alert");
        alert.setIcon(R.drawable.poison);
        alert.show();

    }


}
