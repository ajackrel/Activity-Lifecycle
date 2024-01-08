/*
AUTHOR: Adam Jackrel
DATE: 12/18/23
 */

/*
This app will demonstrate the Activity LifeCycle in Android.
Run the program and use the controls while making close observations using the LOGCAT.
 */

package com.example.applicationlifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button1;
    Button button2;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("First Activity onCreate()");

        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = counter + 1;
                textView.setText(""+counter);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(i);
            }
        });
    }

    protected void onPause(){
        super.onPause();
        System.out.println("First Activity onPause()");
    }

    protected void onStop(){
        super.onStop();
        System.out.println("First Activity onStop()");
    }

    protected void onStart(){
        super.onStart();
        System.out.println("First Activity onStart()");
    }

    protected void onResume(){
        super.onResume();
        System.out.println("First Activity onResume()");
    }

    protected void onRestart(){
        super.onRestart();
        System.out.println("First Activity onRestart()");
    }

    protected void onDestroy(){
        super.onDestroy();
        System.out.println("First Activity onDestroy()");
    }
}