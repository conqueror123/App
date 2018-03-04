package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Chat8Activity extends AppCompatActivity {
    Button b2,b3,b4,b5;
    private int i=0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = (TextView)findViewById(R.id.textView6);
        textView.setText("Friend:hey bro");
        FirstButton();
        SecondButton();
        ThirdButton();
        FourthButton();
        b2.setText("wtup");
        b3.setText("yo");
        b4.setVisibility(View.INVISIBLE);
        b5.setVisibility(View.INVISIBLE);
    }
    public int FirstButton() {

        b2 = (Button) findViewById(R.id.botn2);

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (i==0) {
                    i = i + 1;
                    textView.append("\n\nMe:wtup\n\nFriend:Can you hide images videos and other stuff in android without using any app especially for that");
                    b2.setText("Its old school");
                    b3.setText("yep");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:Its old school\n\nFriend:Woah dude");
                    b2.setText("yes.Im cool");
                    b3.setText("ye,bro");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:yes.Im cool\n\nFreind:Lemme see you do that,But remember you should not use any app or software");
                    b2.setText("ya, sure");
                    b3.setText("piece of cake");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else{
                    startActivity(new Intent(Chat8Activity.this,Level3.class));
                    finish();
                }
            }


        });
        return i;

    }


    public int SecondButton(){
        b3 = (Button)findViewById(R.id.discoverable);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                if (i==0) {
                    i = i + 1;
                    textView.append("\n\nMe:yo\n\nFriend:Can you hide images videos and other stuff in android without using any app especially for that");
                    b2.setText("Its old school");
                    b3.setText("yep");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:yep\n\nFriend:woah dude");
                    b2.setText("yes.Im cool");
                    b3.setText("ye,bro");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:ye,bro\n\nFreind:Lemme see you do that,But remember you should not use any app or software");
                    b2.setText("ya,sure");
                    b3.setText("piece of cake");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else{
                    startActivity(new Intent(Chat8Activity.this,Level8.class));
                    finish();
                }


            }
        });
        return i;
    }
    public int ThirdButton() {

        b4 = (Button) findViewById(R.id.botn4);

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

            }


        });
        return i;

    }
    public int FourthButton() {

        b5 = (Button) findViewById(R.id.discoverable2);

        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

            }


        });
        return i;

    }

}
