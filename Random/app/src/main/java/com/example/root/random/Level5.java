package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class Level5 extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        TextView textView = (TextView) findViewById(R.id.textView5);
        textView.setMovementMethod(new ScrollingMovementMethod());
        ListenOnButton();
        AssetManager assetManager=getAssets();
        InputStream input;
        try {
            input=assetManager.open("level5.txt");
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
    public void ListenOnButton() {

        button = (Button) findViewById(R.id.proceed);
        button.setText("Return to list menu");


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Level5.this,ListActivity.class));
                finish();
            }

        });
    }
}

