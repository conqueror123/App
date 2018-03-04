package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.RandomTransitionGenerator;
import com.flaviofaria.kenburnsview.Transition;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Main2Activity extends AppCompatActivity {
    private KenBurnsView kenBurnsView;
    private boolean isPlay = true;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        kenBurnsView = (KenBurnsView) findViewById(R.id.image);

        MobileAds.initialize(this, "pub-1718455421766790");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AccelerateDecelerateInterpolator ACCELERATE_DECELERATE = new AccelerateDecelerateInterpolator();
        RandomTransitionGenerator generator = new RandomTransitionGenerator(5000, ACCELERATE_DECELERATE);
        kenBurnsView.setTransitionGenerator(generator); //set new transition on kenburns view
        kenBurnsView.setTransitionListener(onTransittionListener());

    }

    private KenBurnsView.TransitionListener onTransittionListener() {
        return new KenBurnsView.TransitionListener() {

            @Override
            public void onTransitionStart(Transition transition) {

            }

            @Override
            public void onTransitionEnd(Transition transition) {

            }
        };
    }

}