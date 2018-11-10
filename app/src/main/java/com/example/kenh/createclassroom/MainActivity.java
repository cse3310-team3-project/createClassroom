package com.example.kenh.createclassroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerStartMonth = (Spinner) findViewById(R.id.spinnerStartMonth);
        ArrayAdapter<CharSequence> adapterStartMonth = ArrayAdapter.createFromResource(this,
                R.array.months, android.R.layout.simple_spinner_item);
        adapterStartMonth.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStartMonth.setAdapter(adapterStartMonth);
/*
        Spinner spinnerStartDay = (Spinner) findViewById(R.id.spinnerStartDay);
        ArrayAdapter<CharSequence> adapterStartDay = ArrayAdapter.createFromResource(this,
                R.array.day, android.R.layout.simple_spinner_item);
        adapterStartDay.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStartDay.setAdapter(adapterStartDay);

        Spinner spinnerStartYear = (Spinner) findViewById(R.id.spinnerStartYear);
        ArrayAdapter<CharSequence> adapterStartYear = ArrayAdapter.createFromResource(this,
                R.array.year, android.R.layout.simple_spinner_item);
        adapterStartYear.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStartYear.setAdapter(adapterStartYear);

*/


    }

}
