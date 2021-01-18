package com.example.fratresfamilia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SingUp(View v) {
        startActivity(new Intent(MainActivity.this, createaccount.class));
    }

    public void loggedIn(View v) {
        startActivity(new Intent(MainActivity.this, home.class));

    }
}