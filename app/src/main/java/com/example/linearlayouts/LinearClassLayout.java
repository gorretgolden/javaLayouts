package com.example.linearlayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class  LinearClassLayout  extends Activity {
//
      Button btn2;
      Intent explicit2;
      @Override


       protected void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);
         setContentView(R.layout.linear_layout);
//
         btn2 = (Button) findViewById(R.id.btn3) ;
         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 explicit2 = new Intent(getApplicationContext(),LinearClassLayout.class);
                 startActivity(explicit2);
             }
         });

     }

}
