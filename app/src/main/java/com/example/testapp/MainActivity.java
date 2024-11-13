package com.example.testapp;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView Name , Year , d ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Name=findViewById(R.id.Name);
        Year=findViewById(R.id.Year);
        d=findViewById(R.id.D);

    }


    public void cala(View view) {
        if (Name.getText().toString().isEmpty()|| Year.getText().toString().isEmpty()){
            Toast.makeText(this, "please fill ", Toast.LENGTH_LONG).show();}
        else{

           String name=Name.getText().toString();
           int year=Integer.parseInt(Year.getText().toString());
            int age=2024-year;
            d.setText("welcome "+name +"\n Your age is"+age);
        }
}
}