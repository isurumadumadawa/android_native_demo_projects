package com.example.democalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNum1, editTextNum2;
    TextView textViewResult;
    Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        textViewResult = findViewById(R.id.textViewResult);
        buttonSum = findViewById(R.id.buttonSum);


        buttonSum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
              int num1 = Integer.parseInt(editTextNum1.getText().toString());
              int num2 = Integer.parseInt(editTextNum2.getText().toString());
              int sum = num1+num2;
              textViewResult.setText(String.valueOf(sum));
            }

        });

    }


}