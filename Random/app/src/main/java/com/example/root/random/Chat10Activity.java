package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Chat10Activity extends AppCompatActivity {
    Button b2,b3,b4,b5;
    private int i=0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = (TextView)findViewById(R.id.textView6);
        textView.setText("victim:hey");
        FirstButton();
        SecondButton();
        ThirdButton();
        FourthButton();
        b2.setText("hola");
        b3.setText("hey,man");
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
                    textView.append("\n\nMe:hola\n\nvictim:how are you?");
                    b2.setText("fine");
                    b3.setText("cool");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:fine\n\nvictim:okay\n\n\t\t/here is where you start your exploit/");
                    b2.setText("Did you here abt this website");
                    b3.setText("this website");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:Did you here abt this website\n\nvictim:which one ?");
                    b2.setText("youwillgethacked.com");
                    b3.setText("The one i told");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==3){
                    i=i+1;
                    textView.append("\n\nMe:youwillgethacked.com\n\nvictim:What about it ?");
                    b2.setText("i got free coupons");
                    b3.setText("i got free money");
                }
                else if (i==4){
                    i=i+1;
                    textView.append("\n\nMe:i got free coupons\n\nvictim:seriously i wanna try it now\n\n/voila the victim fell for it/greed is a important part of social engineering");
                    b2.setText("sure");
                    b3.setText("okay");
                }
                else{
                    startActivity(new Intent(Chat10Activity.this,ListActivity.class));
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
                    textView.append("\n\nMe:hey,man\n\nvictim:how are you");
                    b2.setText("fine");
                    b3.setText("cool");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:cool\n\nvictim:okay\n\n\t\t/here is where you start your exploit/");
                    b2.setText("Did u hear abt this website");
                    b3.setText("this website");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:this website\n\nvictim:which one ?");
                    b2.setText("youwillgethacked.com");
                    b3.setText("the one i told");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==3){
                    i=i+1;
                    textView.append("\n\nMe:the one i told\n\nvictim:what about it?");
                    b2.setText("i got free coupons");
                    b3.setText("i got free money");
                }
                else if (i==4){
                    i=i+1;
                    textView.append("\n\nMe:i got free money\n\nvictim:woah,I am definitely trying it\n\n/voila the victim fell for it/greed is the key in social engineer");
                }
                else{
                    startActivity(new Intent(Chat10Activity.this,ListActivity.class));
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
