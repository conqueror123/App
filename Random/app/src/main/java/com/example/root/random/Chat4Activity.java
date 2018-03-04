package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Chat4Activity extends AppCompatActivity {
    Button b2,b3,b4,b5;
    private int i=0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = (TextView)findViewById(R.id.textView6);
        textView.setText("Developer:Hola Amigo,I developed this application");
        FirstButton();
        SecondButton();
        ThirdButton();
        FourthButton();
        b2.setText("cool");
        b3.setText("hii there");
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
                    textView.append("\n\nMe:cool\n\nDeveloper:Cool indeed,I hope you are enjoying these tutorials");
                    b2.setText("yes!I love em");
                    b3.setText("nope");
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                    b4.setText("I can't understand a thing");
                    b5.setText("Kinda");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:yes!I love em\n\nDeveloper:Great,Keep up the pace ");
                    b2.setText("ya sure");
                    b3.setText("I will");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:ya sure\n\nDeveloper:So far the journey into hacking was fun the next part is where the real thing starts.We are not responsible any sort damage that caused by this knowledge of hacking.This is for education purpose only and to create awareness amongst people\n");
                    b2.setText("okay,I understand");
                    b3.setText("sure");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==3){
                    i=i+1;
                    textView.append("\n\nMe:okay,I understand\n\nDeveloper:On a scale from 1 to 5 ?\n");
                    b2.setText("1-2");
                    b3.setText("2-3");
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                    b4.setText("3-4");
                    b5.setText("4-5");
                }
                else if (i==4){
                    i=i+1;
                    textView.append("\n\nMe:1-2\n\nDeveloper:I feel like crying :'(\n\nrate this app on play store");
                    b2.setText("yes");
                    b3.setText("no,Take me back to me");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==5){
                    //here put the link for playstore
                    Uri uri = Uri.parse("market://details?id=com.example.root.random");
                    Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent);
                    finish();
                }
                else{

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
                    textView.append("\n\nMe:hii there\n\nDeveloper:I hope you are in love with these tutorials");
                    b2.setText("Yes!I love em");
                    b3.setText("nope");
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                    b4.setText("I can't understant a thing");
                    b5.setText("Kinda");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:nope\n\nDeveloper:you need to take it slow and easy.Remember slow and steady wins the race");
                    b2.setText("ya sure");
                    b3.setText("will do");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:will do\n\nDeveloper:So far the journey into hacking was fun the next part is where the real thing starts.We are not responsible any sort damage that caused by this knowledge of hacking.This is for education purpose only and to create awareness amongst people");
                    b2.setText("okay,I understand");
                    b3.setText("sure");
                }
                else if (i==3){
                    i=i+1;
                    textView.append("\n\nMe:sure\n\nDeveloper:On a scale from 1 to 5 ?");
                    b2.setText("1-2");
                    b3.setText("2-3");
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                    b4.setText("3-4");
                    b5.setText("4-5");
                }
                else if (i==4){
                    i=i+1;
                    textView.append("\n\nMe:2-3\n\nDeveloper:Damn.No problemo\n\nrate this app on play store\n");
                    b2.setText("yes");
                    b3.setText("no,Take me back to me");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==5){

                    startActivity(new Intent(Chat4Activity.this,ListActivity.class));
                    finish();
                }
                else{

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
            if (i==1){
                i=i+1;
                textView.append("\n\nMe:I cant understand a thing\n\nDeveloper:It's ok, you will get a hang of it.I too was bad at this but my will did the trick make a strong will and start again");
                b2.setText("ya sure");
                b3.setText("will do");
                b4.setVisibility(View.INVISIBLE);
                b5.setVisibility(View.INVISIBLE);
            }
            else if (i==4){
                i=i+1;
                textView.append("\n\nMe:3-4\n\nDeveloper:nice.You brought a charm on my face\n\nrate this app on play store");
                b2.setText("yes");
                b3.setText("no,Take me back to me");
                b4.setVisibility(View.INVISIBLE);
                b5.setVisibility(View.INVISIBLE);
            }
            else{

            }
            }
        });
        return i;

    }
    public int FourthButton() {

        b5 = (Button) findViewById(R.id.discoverable2);

        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:Kinda\n\nDeveloper:Kinda?Hmmm...Try to fit in a Hacker's world we are always kinda\n\n\tcoool");
                    b2.setText("ya sure");
                    b3.setText("will do");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==4){
                    i=i+1;
                    textView.append("\n\nMe:4-5\n\nDeveloper:Thanks a lot.please do rate it on playstore as well\n\nrate this app on play store");
                    b2.setText("yes");
                    b3.setText("no,Take me back to me");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else {

                }

            }


        });
        return i;

    }

}
