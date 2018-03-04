package com.example.souvikdebnath.demoapp;
import android.content.Intent;
//import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public static Button Register_Here;



    public void OnclickButtonListener(){
        Register_Here =(Button)findViewById(R.id.button);
        Register_Here.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.mohammadzakriya.tech_bgkapp.Secondactivity");
                        startActivity(intent);
                    }
                }
        );
    }
}

