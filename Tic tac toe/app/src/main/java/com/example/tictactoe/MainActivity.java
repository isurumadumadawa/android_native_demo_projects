package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int selectedPlayer = 1;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);

    }

    public void onClickButton(View view) {
        changePlayer();
        changeButtonText(view);
        checkWin();

    }

    void changePlayer() {
        if (selectedPlayer == 1) {
            selectedPlayer = 2;
        } else {
            selectedPlayer = 1;
        }
    }

    void changeButtonText(View _view){
        Button btn = findViewById(_view.getId());

        if (selectedPlayer == 1){ btn.setText("X");}
        else {btn.setText("O");}
    }

    void checkWin(){

        Toast player1Toast = Toast.makeText(this,"Player 1 win",Toast.LENGTH_LONG);
        Toast player2Toast = Toast.makeText(this,"Player 2 win",Toast.LENGTH_LONG);
        //player 1 wining
        if(btn1.getText().toString()=="X" && btn2.getText().toString()=="X" && btn3.getText().toString()=="X"  ){ player1Toast.show(); }
        if(btn4.getText().toString()=="X" && btn5.getText().toString()=="X" && btn6.getText().toString()=="X"  ) { player1Toast.show();}
        if(btn7.getText().toString()=="X" && btn8.getText().toString()=="X" && btn9.getText().toString()=="X"  ) { player1Toast.show(); }

        if(btn1.getText().toString()=="X" && btn4.getText().toString()=="X" && btn7.getText().toString()=="X"  ) { player1Toast.show();}
        if(btn2.getText().toString()=="X" && btn5.getText().toString()=="X" && btn8.getText().toString()=="X"  ) { player1Toast.show(); }
        if(btn3.getText().toString()=="X" && btn6.getText().toString()=="X" && btn9.getText().toString()=="X"  ){ player1Toast.show(); }

        if(btn1.getText().toString()=="X" && btn5.getText().toString()=="X" && btn9.getText().toString()=="X"  ) { player1Toast.show();}
        if(btn3.getText().toString()=="X" && btn5.getText().toString()=="X" && btn7.getText().toString()=="X"  ){ player1Toast.show(); }


        //player 2 wining
        if(btn1.getText().toString()=="O" && btn2.getText().toString()=="O" && btn3.getText().toString()=="O"  ){ player2Toast.show(); }
        if(btn4.getText().toString()=="O" && btn5.getText().toString()=="O" && btn6.getText().toString()=="O"  ) { player2Toast.show(); }
        if(btn7.getText().toString()=="O" && btn8.getText().toString()=="O" && btn9.getText().toString()=="O"  ) { player2Toast.show(); ;}

        if(btn1.getText().toString()=="O" && btn4.getText().toString()=="O" && btn7.getText().toString()=="O"  ) { player2Toast.show();}
        if(btn2.getText().toString()=="O" && btn5.getText().toString()=="O" && btn8.getText().toString()=="O"  ) { player2Toast.show(); }
        if(btn3.getText().toString()=="O" && btn6.getText().toString()=="O" && btn9.getText().toString()=="O"  ){ player2Toast.show(); }

        if(btn1.getText().toString()=="O" && btn5.getText().toString()=="O" && btn9.getText().toString()=="O"  ) { player2Toast.show(); }
        if(btn3.getText().toString()=="O" && btn5.getText().toString()=="O" && btn7.getText().toString()=="O"  ) { player2Toast.show(); }


    }


    public void reset(View view) {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");z  
        btn8.setText("");
        btn9.setText("");
    }
}

