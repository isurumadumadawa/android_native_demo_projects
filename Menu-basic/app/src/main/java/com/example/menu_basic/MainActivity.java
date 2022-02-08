package com.example.menu_basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        // Handle item selection
        switch (item.getItemId()) {
            case R.id.home:
                Toast toastHome =  Toast.makeText(this,"Home",Toast.LENGTH_LONG);
                toastHome.show();
                return true;
            case R.id.notifications:
                Toast toastNotifications =  Toast.makeText(this,"Notifications",Toast.LENGTH_LONG);
                toastNotifications.show();
                return true;
            case R.id.messages:
                Toast toastMessages = Toast.makeText(this,"Messages",Toast.LENGTH_LONG);
                toastMessages.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}