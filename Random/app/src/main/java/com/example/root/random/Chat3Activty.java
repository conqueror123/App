package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Chat3Activty extends AppCompatActivity {
    Button b2,b3,b4,b5;
    private int i=0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = (TextView)findViewById(R.id.textView6);
        textView.setText("X:Hey there, i gotta doubt.Kid");
        FirstButton();
        SecondButton();
        ThirdButton();
        FourthButton();
        b2.setText("Tell Me!!");
        b3.setText("What doubt");
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
                    Toast.makeText(getApplicationContext(), "" + i, Toast.LENGTH_SHORT).show();
                    textView.append("\n\nMe:Tell Me!!\n\nX:Is it possible to flood a computer");
                    b2.setText("With water ;-)");
                    b3.setText("with data?");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:With Water\n\nX:no!! with data. ughhh..:");
                    b2.setText("haha! yes possible");
                    b3.setText("Yes.Possible");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:haha! yes possible\n\nX:How\nhow");
                    b2.setText("follow me");
                    b3.setText("this is how");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else{
                    startActivity(new Intent(Chat3Activty.this,Level3.class));
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
                    Toast.makeText(getApplicationContext(), "" + i, Toast.LENGTH_SHORT).show();
                    textView.append("\n\nMe:What doubt\n\nX:Is it possible to flood a computer");
                    b2.setText("With water?");
                    b3.setText("with data?");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:With data\n\nX:yes,with data");
                    b2.setText("haha! possible");
                    b3.setText("yes.possible");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:Yes posible\n\nX:How?\nhow?\nhow");
                    b2.setText("follow me");
                    b3.setText("this is how");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else{
                    startActivity(new Intent(Chat3Activty.this,Level3.class));
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
