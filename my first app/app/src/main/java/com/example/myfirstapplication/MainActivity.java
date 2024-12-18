package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private static boolean c=true ;
private static TextView cc ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        cc = findViewById(R.id.c);
    }
    public static void c(View view){
        if(c ==true) {
            c=false;
            cc.setText("HELLLLO");
        }
        else {
            c=true;
            cc.setText("Helo World !");
        }
    }

    public void b(View view){
        finish();
    }

}