package com.example.remot;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
private static boolean on=true ;
private int mod = 1 , num=22  ;
private TextView mood;
    private static TextView oof;
    private TextView temp ;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       mood=findViewById(R.id.m);
       temp=findViewById(R.id.num);
       oof=findViewById(R.id.on);

    }

    public  static void onOf (View view){
        if(on){
            on = false;
          oof.setText("of");}
        else{
            on=true ;
        oof.setText("on");}
    }


    public void mod(View view) {
        if (on==true){
            if(mod==1){
                mod=0;
                mood.setText("heat");

            }
            else{
                mod=1;
                mood.setText("cool");
            }
        }

    }

    public void up(View view) {
        if(on==true&&num<=29&&num>=16) {
            num++;
            temp.setText("" + num);
        }}

    public void down(View view) {
        if(on==true&&num<=30&&num>=17) {
            num--;
            temp.setText("" + num);
        }}


}