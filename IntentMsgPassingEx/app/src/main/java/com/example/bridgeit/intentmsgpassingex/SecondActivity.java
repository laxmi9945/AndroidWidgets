package com.example.bridgeit.intentmsgpassingex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by laxmi9946 on 3/19/2017.
 */
public class SecondActivity extends AppCompatActivity
{
    EditText enum1, enum2;
    //private  static int sum = 0,n1=0,n2=0;
    Button btn_back, btn_add;
    //private  static String summation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        enum1 = (EditText) findViewById(R.id.num1);
        enum2 = (EditText) findViewById(R.id.num2);

        btn_add = (Button) findViewById(R.id.add);
        btn_back = (Button) findViewById(R.id.back);

    }
            public void ADD(View v) {

                    /*n1 = Integer.parseInt(enum1.getText().toString());
                    n2 = Integer.parseInt(enum2.getText().toString());
                    sum = n1 +n2;
                    summation = String.valueOf(sum);
                    Toast.makeText(SecondActivity.this, "Sum is "+summation, Toast.LENGTH_LONG).show();*/

                    String str=enum1.getText().toString();
                Intent intent=new Intent(this,MainActivity.class);
                //intent.putExtra("sum",summation);
                intent.putExtra("sum",str);
                setResult(2, intent);
                finish();
            }
            public void BACK(View view){
                Intent intent2=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);

            }

    }


