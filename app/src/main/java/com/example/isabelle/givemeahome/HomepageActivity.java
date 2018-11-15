package com.example.isabelle.givemeahome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnFind) {
            i = new Intent(this, MainMenuActivity.class);
            startActivity(i);
        }

    }
}
