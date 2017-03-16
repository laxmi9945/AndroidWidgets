package com.example.bridgeit.mymenutest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.telecom.Call;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by bridgeit on 15/3/17.
 */

public class ContextMenu extends AppCompatActivity {
    ListView listView;
    String contacts[]={"Andy","Lewis","Trozan","Monk","Kewi","peter","Monty","Envy","Swagger","abc","def","xyz"};
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contextmenttest);
        listView=(ListView)findViewById(R.id.lv);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,contacts);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select the Action");
        menu.add(0,v.getId(),0,"Call");
        menu.add(0,v.getId(),0,"SMS");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle()== "Call"){
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_DIAL);
            startActivity(intent);
            //Toast.makeText(getApplicationContext(),"Calling...",Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle()=="SMS"){
            Intent intent=new Intent();
            intent.setAction(Intent.CATEGORY_APP_MESSAGING);
            startActivity(intent);
            //Toast.makeText(getApplicationContext(),"SMS Sent...",Toast.LENGTH_SHORT).show();
        }
        else{
            return false;
        }
        return true;
    }

}
