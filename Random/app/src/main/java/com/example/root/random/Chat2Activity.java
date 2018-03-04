package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.root.random.R.id.textView;

public class Chat2Activity extends AppCompatActivity {
    Button b2,b3,b4,b5;
    private int i=0;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = (TextView)findViewById(R.id.textView6);
        textView.setText("Sam:Hey");
        FirstButton();
        SecondButton();
        ThirdButton();
        FourthButton();
        b2.setText("hey");
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
                    textView.append("\n\nMe:Hey\n\nSam:I need a little help");
                    b2.setText("Tell me,Im all ears");
                    b3.setText("what is it?");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:Tell me,Im all ears\n\nSam:I need to play prank on my friend");
                    b2.setText("Seriously");
                    b3.setText("You sure!");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:Seriously\n\nSam:Yes,Can you do it or not");
                    b2.setText("Ya sure");
                    b3.setText("Will do");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==3){
                    i=i+1;
                    Toast.makeText(getApplicationContext(),""+i,Toast.LENGTH_SHORT).show();
                    textView.append("\n\nMe:Ya sure\n\nSam:Thanks dawg . I owe you one.See u in a while then");
                    b2.setText("Cao");
                    b3.setText("bye");

                }
                else{
                    startActivity(new Intent(Chat2Activity.this,Level2.class));
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
                    textView.append("\n\nMe:Hola\n\nSam:I needed a little help");
                    b2.setText("Tell me,Im all ears");
                    b3.setText("What is it ?");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:What is it ?\n\nSam:I need to play a prank on my friend");
                    b2.setText("Seriously");
                    b3.setText("You sure");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:You sure\n\nSam:Yes can you do it or not ?");
                    b2.setText("Ya,sure");
                    b3.setText("will do");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if(i==3){
                    i=i+1;
                    textView.append("\n\nMe:ok\n\nSam:ok,Thanks dawg see u in the next level");
                    b2.setText("Cao");
                    b3.setText("bye");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else if (i==4){
                    startActivity(new Intent(Chat2Activity.this,Level2.class));
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
