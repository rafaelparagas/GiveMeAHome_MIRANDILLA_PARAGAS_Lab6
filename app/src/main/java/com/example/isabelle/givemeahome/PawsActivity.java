package com.example.isabelle.givemeahome;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PawsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paws);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnpawGall) {
            i = new Intent(this, activity_pawsgallery.class);
            startActivity(i);
        }

    }

    public void back (View v){
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnpawBackmen) {
            i = new Intent(this, MainMenuActivity.class);
            startActivity(i);
        }

    }

    public void onWeb(View v) {
        if (v.getId() == R.id.btnpawWeb) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paws.org.ph/"));
            startActivity(i);
        }
    }
}
