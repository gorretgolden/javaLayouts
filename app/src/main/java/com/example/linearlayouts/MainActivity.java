package com.example.linearlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Intent explicit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
   btn = (Button) findViewById(R.id.btn1);
   btn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           explicit1 =new Intent(getApplicationContext(),FrameClassLayout.class);
      startActivity(explicit1);
       }
   });
//
    }
}