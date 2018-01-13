package com.example.mohamed.agecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ageCounter(View view) {
        EditText age = (EditText)findViewById(R.id.editText);
        int yearOFBirth = Integer.parseInt(age.getText().toString());
        int yourage=2017-yearOFBirth;
        Toast.makeText(this,"Your Age :"+String.valueOf(yourage),Toast.LENGTH_LONG).show();
    }
}
