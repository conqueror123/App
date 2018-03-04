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

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import com.example.root.random.Cont.Constants;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import static com.example.root.random.R.id.textView5;

public class Level1 extends AppCompatActivity {
    Button button;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_level1);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView textView = (TextView) findViewById(R.id.textView5);

        textView.setMovementMethod(new ScrollingMovementMethod());

        ListenOnButton();
        AssetManager assetManager=getAssets();
        InputStream input;
        try {
            input=assetManager.open("sdfsd.txt");
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

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                startActivity(new Intent(Level1.this,ChatActivity.class));
                finish();
            }

        });
    }
}

