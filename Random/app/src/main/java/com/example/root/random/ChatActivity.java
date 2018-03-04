package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {
    private TextView textView;
    private int i=0;
    Button b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = (TextView)findViewById(R.id.textView6);
        textView.setText("Unknown: hey there");
        FirstButton();
        SecondButton();
        ThirdButton();
        FourthButton();
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
                    textView.append("\n\nMe:Hi\n\nUnknown:I will be your guide in this process of learning");
                    b2.setText("nice");
                    b3.setText("ok");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:Nice\n\nUnknown:Tell Me What kind of hacker you want to be");
                    b2.setText("Script Kiddie");
                    b3.setText("Black Hat");
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                    b4.setText("grey Hat");
                    b5.setText("White Hat");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:Script Kiddie\n\nAnonymous:Please dont be annoying to other\tbut an excellent choice for a noob");
                    b2.setText("sure");
                    b3.setText("ok");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==3){
                    i=i+1;
                    textView.append("\n\nMe:sure\n\nUnknown:ok,then will see you in next level");
                    b2.setText("Cao");
                    b3.setText("bye");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(),""+i,Toast.LENGTH_SHORT).show();

                }
                else if (i==4){
                    i=i+1;
                    Toast.makeText(getApplicationContext(),""+i,Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(ChatActivity.this,ListActivity.class));
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
                    textView.append("\n\nMe:Hola\n\nUnknown:I will be your guide in this process of learning");
                    b2.setText("nice");
                    b3.setText("ok");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:ok\n\nUnknown:Tell Me What kind of hacker you want to be");
                    b2.setText("Script Kiddie");
                    b3.setText("Black Hat");
                    b4.setVisibility(View.VISIBLE);
                    b5.setVisibility(View.VISIBLE);
                    b4.setText("grey Hat");
                    b5.setText("White Hat");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:Black Hat\n\nUnknown:Be careful for what you wish for its a dangerous path");
                    b2.setText("sure");
                    b3.setText("ok");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if(i==3){
                    i=i+1;
                    textView.append("\n\nMe:ok\n\nSam:ok,then will see you in next level");
                    b2.setText("Cao");
                    b3.setText("bye");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==4){
                    i=i+1;
                    startActivity(new Intent(ChatActivity.this,ListActivity.class));
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
                if(i==2){
                    i=i+1;
                    textView.append("\n\nMe:Grey Hat\n\nUnknown:there's a fine line kid.I hope u don cross that line");
                    b2.setText("sure");
                    b3.setText("ok");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if(i==3){
                    i=i+1;
                    textView.append("\n\nMe:you the boss\n\nUnknown:ok,then will see you in the next level");
                    b2.append("cao");
                    b3.setText("bye");
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
                if (i == 2) {
                    i=i+1;
                    textView.append("\n\nMe:white hat\n\nUnknown:Keep up the good work kid.");
                    b2.setText("sure");
                    b3.setText("ok");
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
