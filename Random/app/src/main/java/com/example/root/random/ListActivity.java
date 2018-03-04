package com.example.root.random;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.root.random.Cont.Constants;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ListActivity extends AppCompatActivity {

    ListView lv;
    String[] characters={"1.Introduction","2.Batch Files","3.Application Flooder","4.You n the Developer","5.Keylogger","6.wipe out the data","7.Data behind images","8.Hiding info in android without any app","9.Hashing and encryption","10.Social engineering","11.Meet Kali linux","12.Metasploit","13.Android Hacking","14.Beef framework","15.Time to say good bye"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        lv = (ListView)findViewById(R.id.idListView);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,characters);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){

                if (i==0){
                    startActivity(new Intent(ListActivity.this,Level1.class));
                }
                else if (i==1){
                    startActivity(new Intent(ListActivity.this,Chat2Activity.class));
                }
                else if (i==2){
                    startActivity(new Intent(ListActivity.this,Chat3Activty.class));
                }
                else if (i==3){
                    startActivity(new Intent(ListActivity.this,Chat4Activity.class));
                }
                else if (i==4){
                    startActivity(new Intent(ListActivity.this,Chat5Activity.class));
                }
                else if (i==5){
                    startActivity(new Intent(ListActivity.this,Chat6Activity.class));
                }
                else if (i==6){
                    startActivity(new Intent(ListActivity.this,Level7.class));
                }
                else if (i==7){
                    startActivity(new Intent(ListActivity.this,Chat8Activity.class));
                }
                else if (i==8){
                    startActivity(new Intent(ListActivity.this,Level9.class));
                }
                else if (i==9){
                    startActivity(new Intent(ListActivity.this,Level10.class));
                }
                else if (i==10){
                    startActivity(new Intent(ListActivity.this,Level11.class));
                }
                else if (i==11){
                    startActivity(new Intent(ListActivity.this,Level12.class));
                }
                else if (i==12){
                    startActivity(new Intent(ListActivity.this,Level13.class));
                }
                else if (i==13){
                    startActivity(new Intent(ListActivity.this,Level14.class));
                }
                else if (i==14){
                    startActivity(new Intent(ListActivity.this,Level15.class));
                }
                else{
                    Toast.makeText(getApplicationContext(),"on the way",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
