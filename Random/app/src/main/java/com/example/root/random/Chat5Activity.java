package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Chat5Activity extends AppCompatActivity {
    Button b2,b3,b4,b5;
    private int i=0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = (TextView)findViewById(R.id.textView6);
        textView.setText("Friend:Hey, brotha");
        FirstButton();
        SecondButton();
        ThirdButton();
        FourthButton();
        b2.setText("whatup");
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
                    textView.append("\n\nMe:whatup\n\nFriend:Bro,i needed a little help");
                    b2.setText("Anything for my bud");
                    b3.setText("tell");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:Anything for my bud\n\nFriend:I wanted to hack my roomate's account in different social networking sites");
                    b2.setText("Absolutely");
                    b3.setText("Yep");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:Absolutely\n\nFriend:How");
                    b2.setText("Here's the secret");
                    b3.setText("its like");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else{
                    startActivity(new Intent(Chat5Activity.this,Level5.class));
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
                    textView.append("\n\nMe:hey,man\n\nFriend:Bro,i needed a little help");
                    b2.setText("Anything for my bud");
                    b3.setText("tell");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:tell\n\nFriend:I wanted to hack my roomate's account in different social networking sites");
                    b2.setText("Absolutely");
                    b3.setText("Yep");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:yep\n\nFriend:How'd you do that");
                    b2.setText("Here's the secret");
                    b3.setText("its like");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else{
                    startActivity(new Intent(Chat5Activity.this,Level5.class));
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
