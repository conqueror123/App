package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Chat6Activity extends AppCompatActivity {
    Button b2,b3,b4,b5;
    private int i=0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = (TextView)findViewById(R.id.textView6);
        textView.setText("Friend:Hey, there");
        FirstButton();
        SecondButton();
        ThirdButton();
        FourthButton();
        b2.setText("hiii");
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
                    textView.append("\n\nMe:hiii\n\nFriend:I needed a little help");
                    b2.setText("k,");
                    b3.setText("tell");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:k\n\nFriend:Is it possible to delete the contains by using a batch file");
                    b2.setText("It is possible");
                    b3.setText("yes,u can do that");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:It is possible\n\nFriend:I wonder how");
                    b2.setText("lemme tell ya");
                    b3.setText("here's how");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else{
                    startActivity(new Intent(Chat6Activity.this,level6.class));
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
                    textView.append("\n\nMe:hey,man\n\nFriend:I needed a little help");
                    b2.setText("k");
                    b3.setText("tell");

                }
                else if (i==1){
                    i=i+1;
                    textView.append("\n\nMe:tell\n\nFriend:Is it possible to wipe out the contents using batch files");
                    b2.setText("It is possible");
                    b3.setText("Yes,you can do that");
                }
                else if (i==2){
                    i=i+1;
                    textView.append("\n\nMe:yes,you can do that\n\nFriend:I wonder how");
                    b2.setText("lemme tellya");
                    b3.setText("here's how");
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                }
                else{
                    startActivity(new Intent(Chat6Activity.this,level6.class));
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
