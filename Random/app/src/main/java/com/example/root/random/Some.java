package com.example.root.random;

import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Some extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_some);
        TextView textView =(TextView)findViewById(R.id.textView2);
        AssetManager assetManager=getAssets();
        InputStream input;
        try {
            input=assetManager.open("about.txt");
            int Size=input.available();
            byte[] buffer = new byte[Size];
            input.read(buffer);
            input.close();
            String text = new String(buffer);
            textView.setText(text);

        }catch (IOException e){

            e.printStackTrace();
        }
    }
}
