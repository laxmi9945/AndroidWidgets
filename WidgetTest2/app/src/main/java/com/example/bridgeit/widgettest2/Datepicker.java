package com.example.bridgeit.widgettest2;

import android.app.Activity;
import android.icu.text.SimpleDateFormat;
import android.icu.util.ULocale;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bridgeit on 11/3/17.
 */


public  class Datepicker extends AppCompatActivity {
    DatePicker datePicker;
    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker);
        datePicker = (DatePicker) findViewById(R.id.dtpkr);
        //Button btn=(Button)findViewById(R.id.dtbtn);
        tv=(TextView)findViewById(R.id.dtid);

        tv.setText(getCurrentDate());
    }
    /*public void Date(View view){
        Toast.makeText(getApplicationContext(),"Today's Date"+tv,Toast.LENGTH_SHORT).show();
    }*/
    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();
        builder.append("Current Date: ");
        builder.append((datePicker.getMonth() + 1)+"/");//month is 0 based
        builder.append(datePicker.getDayOfMonth()+"/");
        builder.append(datePicker.getYear());
        return builder.toString();
    }
}
