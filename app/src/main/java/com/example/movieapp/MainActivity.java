package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button b;
String s,ss,r="Invalid credentials";
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.user);
        et2=(EditText)findViewById(R.id.pass);
        b=(Button) findViewById(R.id.log);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=et1.getText().toString();
                ss=et2.getText().toString();
                if(s.equals("Theatre") && ss.equals("123456"))
                {
                Intent ob=new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(ob);
            }
                else
                {
                    Toast.makeText(getApplicationContext(),r,Toast.LENGTH_LONG).show();
                }}
        });
        };
    }
