package com.example.demologin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class Home extends AppCompatActivity {

    TextView textViewUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textViewUserName = findViewById(R.id.textViewUserName);
        Bundle b = getIntent().getExtras();
        String userName = b.getString("userName");
        textViewUserName.setText("Hello "+userName);

    }
    public void onLogout(View view){

        finish();
    }
}