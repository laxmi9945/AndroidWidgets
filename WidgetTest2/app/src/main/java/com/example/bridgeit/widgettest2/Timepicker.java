package com.example.bridgeit.widgettest2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by bridgeit on 11/3/17.
 */

public class Timepicker extends AppCompatActivity{
    TextView textView;
    TimePicker timePicker;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timepicker);
        textView=(TextView)findViewById(R.id.timetv);
        timePicker=(TimePicker)findViewById(R.id.timepicker);
        timePicker.setIs24HourView(true);
        textView.setText(getCurrentTime());
    }
    public String getCurrentTime(){
        String currentTime="Current Time: "+timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        return currentTime;
    }
}