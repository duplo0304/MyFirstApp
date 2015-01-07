package com.wearable.duplo.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.wearable.duplo.myfirstapp.MESSAGE"; // Key für Intent in public Variable = good practice

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_search:
                //openSearch();
                return true;
            case R.id.action_settings:
                //openSettings();
                return true;
            case R.id.action_refresh:
                //openRefresh();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /** Wird aufgerufen, wenn User den 'Senden' Button drückt **/
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class); //(Context, da-soll-System-den-Intent-Hinschicken
        EditText editText = (EditText) findViewById(R.id.edit_message); // Inhalt des Wertes bekommen
        String message = editText.getText().toString(); //lokale Variable 'Message" zum Speichern des String
        intent.putExtra(EXTRA_MESSAGE, message); //putExtra zum Anhängen des Textwerts an Intent
        startActivity(intent);
    }
}
