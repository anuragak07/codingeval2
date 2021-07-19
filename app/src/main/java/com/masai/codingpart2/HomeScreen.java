package com.masai.codingpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
    private TextView mtvDate;
    private TextView mtvPositive;
    private TextView mtvNegative;
    private TextView mtvHospitalised;
    private TextView mtvonVentiLator;
    private TextView mtvDeath;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        initViews();
                
    }

    private void initViews() {
        mtvDate =findViewById(R.id.Date);
        mtvNegative =findViewById(R.id.Negative);
        mtvPositive=findViewById(R.id.Positive);
        mtvHospitalised=findViewById(R.id.HospitalisedCurrently);
        mtvonVentiLator=findViewById(R.id.OnVentilator);
        mtvDeath =findViewById(R.id.Death);

    }
}