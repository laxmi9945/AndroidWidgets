package com.example.bridgeit.intentmsgpassingex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView result;
        Button btn_next;
        private  int mRequestCode = 100;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            result = (TextView) findViewById(R.id.res);
            btn_next = (Button) findViewById(R.id.next);

        }
    public void Next(View v) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivityForResult(intent, 2);
                /* To get data from Another Activity*/

    }


        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {

            super.onActivityResult(requestCode, resultCode, data);
            // if(requestCode == mRequestCode && resultCode ==RESULT_OK)
            if(requestCode == 2)
            {
                String editTextString = data.getStringExtra("sum");
                result.setText("Result is :"+editTextString);

            }

        }
}
