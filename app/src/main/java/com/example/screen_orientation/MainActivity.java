package com.example.screen_orientation;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button Land,Port;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.activity_main);

        Land=(Button)findViewById(R.id.butt1);
        Port=(Button)findViewById(R.id.butt2);

        Land.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
        });
        Port.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }
        });
    }
}