package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        //String str = getResource().getString(R.string.edit_message);
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        //String message = editText.getText().toString();
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        String message = String.valueOf(spinner.getSelectedItem());
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}