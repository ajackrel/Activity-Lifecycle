package com.example.applicationlifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        System.out.println("Second Activity onCreate()");

        button = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

    protected void onPause(){
        super.onPause();
        System.out.println("Second Activity onPause()");
    }

    protected void onStop(){
        super.onStop();
        System.out.println("Second Activity onStop()");
    }

    protected void onStart(){
        super.onStart();
        System.out.println("Second Activity onStart()");
    }

    protected void onResume(){
        super.onResume();
        System.out.println("Second Activity onResume()");
    }

    protected void onRestart(){
        super.onRestart();
        System.out.println("Second Activity onRestart()");
    }

    protected void onDestroy(){
        super.onDestroy();
        System.out.println("Second Activity onDestroy()");
    }
}