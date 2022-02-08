package com.example.menuadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
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

        SearchManager manager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);

        SearchView search = (SearchView) menu.findItem(R.id.search).getActionView();

        search.setSearchableInfo(manager.getSearchableInfo(getComponentName()));

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast toastSearch =  Toast.makeText(getApplicationContext(),query,Toast.LENGTH_LONG);
                toastSearch.show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {



                return true;

            }

        });
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
            case R.id.search:
                Toast toastSearch =  Toast.makeText(this,"Search",Toast.LENGTH_LONG);
                toastSearch.show();
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