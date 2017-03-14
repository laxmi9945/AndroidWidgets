package com.example.bridgeit.progressbar;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.btn);
        textView=(TextView)findViewById(R.id.tv2);
    }
    public void proceed(View view){
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Loading Example.....");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setIndeterminate(false);
        progressDialog.setProgress(0);
        progressDialog.show();
        final int totalProgressTime=100;
        Thread t=new Thread()
        {
            @Override
            public void run(){
            int jumptime=0;
            while(jumptime<=totalProgressTime){
                try {
                    sleep(200);
                    jumptime +=5;
                    progressDialog.setProgress(jumptime);
                    if(jumptime == 100){
                        MainActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                Toast.makeText(MainActivity.this, "Loading Complited", Toast.LENGTH_SHORT).show();
                                progressDialog.dismiss();
                            }
                        });
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        };
        t.start();

    }
}
