package com.example.linearlayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AbsoluteClassLayout extends Activity {

     Button btnA;
     Intent explicitA;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.absolute_layout);
//
//        btnA = (Button) findViewById(R.id.btn3) ;
//        btnA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                explicit3 = new Intent(getApplicationContext(),FrameClassLayout.class);
//                startActivity(explicit3);
//            }
//        });

    }


}
