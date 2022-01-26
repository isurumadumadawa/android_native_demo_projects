package com.example.demologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String userName ="Isuru", password="123456";
    EditText editTextUserName, editTextPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUserName = findViewById(R.id.editTextUserName);
        editTextPassword = findViewById(R.id.textViewUserName);
    }


    public void onLogin(View view){
       if(userName.equals(editTextUserName.getText().toString()) && password.equals(editTextPassword.getText().toString())){
           Intent intent = new Intent(this,Home.class);
           intent.putExtra("userName",editTextUserName.getText().toString());
           editTextPassword.setText("");
           editTextUserName.setText("");
           startActivity(intent);

       }

    }
}