package com.example.capstoneprojectlange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class moretodolists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moretodolists);
    }

    public void congratulations(View view) {
        Intent i = new Intent(this,Congratulations.class);
        startActivity(i);
    }
}