package com.example.rishabh.introapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences pref=getSharedPreferences("ActivityPREF", Context.MODE_PRIVATE);
        if(pref.getBoolean("activity_executed",false)){
            Intent i=new Intent(this,Intro.class);
            startActivity(i);
            finish();
        }
        else{
            SharedPreferences.Editor ed=pref.edit();
            ed.putBoolean("activity_executed",true);
            ed.commit();
        }
    }
    public void begin(View view){
        Intent i=new Intent(this,Intro.class);
        startActivity(i);
    }
}

