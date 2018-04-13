package com.example.sam.reminderss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class spiner extends AppCompatActivity {
 String[] event;
 @Override
     protected void onCreate(Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
     event = getResources().getStringArray(R.array.event_array);
     Spinner s1 = (Spinner) findViewById(R.id.spinner);
     ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
             android.R.layout.simple_spinner_item,event);
     s1.setAdapter(adapter);
     s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public  void onItemSelected(AdapterView<?> arg0,
                                     View arg1, int arg2, long arg3)
         {
             int index = arg0.getSelectedItemPosition();
             Toast.makeText(getBaseContext(),
                     "you have selected item : " + event[index],
                     Toast.LENGTH_SHORT).show();
         }
         @Override
         public void onNothingSelected(AdapterView<?> arg0){}
     });
 }

 }
