package com.example.bridgeit.mymenutest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn);
        button2=(Button)findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ContextMenu.class);
                startActivity(intent);
            }
        });
    }
    public void Popup(View view){
        //Creating the instance of Popup menu
        PopupMenu popupMenu=new PopupMenu(MainActivity.this,button2);
        //Inflating the popup using xml file
        popupMenu.getMenuInflater().inflate(R.menu.menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(getApplicationContext(),"You Clicked:"+item.getTitle(),Toast.LENGTH_LONG).show();
                return true;
            }
        });
        popupMenu.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.android:
                Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ios:
                Toast.makeText(this, "IOS", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.angular:
                Toast.makeText(this, "Angular", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mean:
                Toast.makeText(this, "Mean", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.aws:
                Toast.makeText(this, "AWS", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
        }

}

