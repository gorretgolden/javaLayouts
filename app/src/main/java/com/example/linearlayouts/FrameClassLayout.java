package com.example.linearlayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrameClassLayout extends Activity {


    Button btnBack;
    Intent explicitBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);

        btnBack = (Button) findViewById(R.id.btn4) ;
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explicitBack = new Intent(getApplicationContext(),AbsoluteClassLayout.class);
                startActivity(explicitBack);
            }
        });


    }
}
