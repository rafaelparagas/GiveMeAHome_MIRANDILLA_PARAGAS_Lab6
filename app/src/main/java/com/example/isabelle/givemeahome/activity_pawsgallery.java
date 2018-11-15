package com.example.isabelle.givemeahome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_pawsgallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pawsgallery);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnPawback) {
            i = new Intent(this, PawsActivity.class);
            startActivity(i);
        }

    }

}
