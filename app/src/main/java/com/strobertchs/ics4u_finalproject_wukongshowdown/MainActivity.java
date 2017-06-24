package com.strobertchs.ics4u_finalproject_wukongshowdown;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Variable for background music
    MediaPlayer background_music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonPlay = (Button)findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(this);

        //Playing Background Music
        background_music = MediaPlayer.create(MainActivity.this, R.raw.background);
        background_music.setLooping(true);
        background_music.start();
    }

    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this, GameActivity.class);
        startActivity(i);

    }

    public void ruleClick(View v){
        //Outputs a message when clicking the rule button.
        Toast.makeText(this, "This is a reactive game similar to Whack-a-mole! However, To progress in the game you have to focus the Darker Demons.",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the help button.");
        Intent i;
    }

    public void quitClick(View v) {
        finish();
        System.exit(0);
    }
}
