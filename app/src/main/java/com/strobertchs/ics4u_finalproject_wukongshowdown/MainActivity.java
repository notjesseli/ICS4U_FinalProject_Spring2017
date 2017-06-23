package com.strobertchs.ics4u_finalproject_wukongshowdown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonPlay = (Button)findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this, GameActivity.class);
        startActivity(i);
    }

    public void ruleClick(View v){
        //Outputs a message when clicking the rule button.
        Toast.makeText(this, "This is a reactive game similar to Whack-a-mole!",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the help button.");
        Intent i;
    }

    public void quitClick(View v) {
        finish();
        System.exit(0);
    }
}
