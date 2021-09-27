package com.example.gmng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gmnglib.GmngMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GmngMessage.showMessage(this,"Hello GMNG");
    }
}