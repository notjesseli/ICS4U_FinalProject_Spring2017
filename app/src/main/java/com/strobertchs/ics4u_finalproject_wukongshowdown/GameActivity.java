package com.strobertchs.ics4u_finalproject_wukongshowdown;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private int score = 0;
    TextView textObjectView;

    //Variable for punch sound
    MediaPlayer punch_sound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        punch_sound = MediaPlayer.create(GameActivity.this, R.raw.punch);

        textObjectView = (TextView) findViewById(R.id.textView);
    }

    Demon Lucifer = new Demon(1, 1);
    Demon Iblis = new Demon(1,1);
    Demon Egyn = new Demon(1,1);
    Demon Amaimon = new Demon(1,1);
    Demon Azazel = new Demon(2,1);
    Demon Mephisto = new Demon(2, 1);
    Demon Beelzebub = new Demon(2,1);
    Demon Satan = new Demon(2,1);
    Monkey WuKong = new Monkey(3, "WUKONG", 1, score);





    public void luciferclick(View v) {
        View azazelclick = findViewById(R.id.Azazel);
        View luciferclick = findViewById(R.id.Lucifer);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
        View nextClick = findViewById(R.id.Next);

        Lucifer.setHearts(Lucifer.getHearts() - WuKong.getStrength());

        if(Lucifer.getHearts() <= 0) {

            luciferclick.setVisibility(View.GONE);
            score += 50;
            Random num = new Random();
            int rannum = num.nextInt(4) + 1;

            if (rannum == 1) {
                azazelclick.setVisibility(View.VISIBLE);
                Azazel.setHearts(2);
            } else if (rannum == 2) {
                iblisclick.setVisibility(View.VISIBLE);
            } else if (rannum == 3) {
                egynclick.setVisibility(View.VISIBLE);
            } else if (rannum == 4) {
                amaimonclick.setVisibility(View.VISIBLE);
            }
            textObjectView.setText("Score: " + score);
            //Punch Sound
            punch_sound.start();
            if (score >= 1000) {
                nextClick.setVisibility(View.VISIBLE);
            }
        }
    }

    public void iblisclick (View v) {
        View mephistoclick = findViewById(R.id.Mephisto);
        View luciferclick = findViewById(R.id.Lucifer);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
        View nextClick = findViewById(R.id.Next);
        Iblis.setHearts(Iblis.getHearts() - WuKong.getStrength());

        if(Iblis.getHearts() <= 0) {
            iblisclick.setVisibility(View.GONE);
            score += 50;
            Random num = new Random();
            int rannum = num.nextInt(4) + 1;

            if (rannum == 1) {
                luciferclick.setVisibility(View.VISIBLE);
            } else if (rannum == 2) {
                mephistoclick.setVisibility(View.VISIBLE);
                Mephisto.setHearts(2);
            } else if (rannum == 3) {
                egynclick.setVisibility(View.VISIBLE);
            } else if (rannum == 4) {
                amaimonclick.setVisibility(View.VISIBLE);
            }
            textObjectView.setText("Score: " + score);
            if (score >= 1000) {
                nextClick.setVisibility(View.VISIBLE);
            }
        }

        //Punch Sound
        punch_sound.start();
    }

    public void egynclick(View v) {
        View beelzebubclick = findViewById(R.id.Beelzebub);
        View luciferclick = findViewById(R.id.Lucifer);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
        View nextClick = findViewById(R.id.Next);
        Egyn.setHearts(Egyn.getHearts() - WuKong.getStrength());

        if(Egyn.getHearts() <= 0) {
            egynclick.setVisibility(View.GONE);
            score += 50;
            Random num = new Random();
            int rannum = num.nextInt(4) + 1;

            if (rannum == 1) {
                luciferclick.setVisibility(View.VISIBLE);
            } else if (rannum == 2) {
                iblisclick.setVisibility(View.VISIBLE);
            } else if (rannum == 3) {
                beelzebubclick.setVisibility(View.VISIBLE);
                Beelzebub.setHearts(2);
            } else if (rannum == 4) {
                amaimonclick.setVisibility(View.VISIBLE);
            }
            textObjectView.setText("Score: " + score);
            if (score >= 1000) {
                nextClick.setVisibility(View.VISIBLE);
            }
        }

        //Punch Sound
        punch_sound.start();
    }

    public void amaimonclick(View v) {
        View satanclick = findViewById(R.id.Satan);
        View luciferclick = findViewById(R.id.Lucifer);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
        View nextClick = findViewById(R.id.Next);
        Amaimon.setHearts(Amaimon.getHearts() - WuKong.getStrength());

        if(Amaimon.getHearts() <= 0) {
            amaimonclick.setVisibility(View.GONE);
            score += 50;
            Random num = new Random();
            int rannum = num.nextInt(4) + 1;

            if (rannum == 1) {
                luciferclick.setVisibility(View.VISIBLE);
            } else if (rannum == 2) {
                iblisclick.setVisibility(View.VISIBLE);
            } else if (rannum == 3) {
                egynclick.setVisibility(View.VISIBLE);
            } else if (rannum == 4) {
                satanclick.setVisibility(View.VISIBLE);
                Satan.setHearts(2);
            }
            textObjectView.setText("Score: " + score);
            if (score >= 1000) {
                nextClick.setVisibility(View.VISIBLE);
            }
        }

        //Punch Sound
        punch_sound.start();
    }

    public void azazelclick(View v) {
        View azazelclick = findViewById(R.id.Azazel);
        View luciferclick = findViewById(R.id.Lucifer);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
        View nextClick = findViewById(R.id.Next);

        Azazel.setHearts(Azazel.getHearts() - WuKong.getStrength());

        if(Azazel.getHearts() <= 0){
            azazelclick.setVisibility(View.GONE);
            score += 100;
            luciferclick.setVisibility(View.VISIBLE);
            iblisclick.setVisibility(View.VISIBLE);
            egynclick.setVisibility(View.VISIBLE);
            amaimonclick.setVisibility(View.VISIBLE);
            textObjectView.setText("Score: " + score);
            if (score >= 1000) {
                nextClick.setVisibility(View.VISIBLE);
            }

        }


        //Punch Sound
        punch_sound.start();

    }

    public void mephistoclick(View v) {
        View mephistoclick = findViewById(R.id.Mephisto);
        View luciferclick = findViewById(R.id.Lucifer);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
        View nextClick = findViewById(R.id.Next);

        Mephisto.setHearts(Mephisto.getHearts() - WuKong.getStrength());

        if(Mephisto.getHearts() <= 0){
            mephistoclick.setVisibility(View.GONE);
            score += 100;
            luciferclick.setVisibility(View.VISIBLE);
            iblisclick.setVisibility(View.VISIBLE);
            egynclick.setVisibility(View.VISIBLE);
            amaimonclick.setVisibility(View.VISIBLE);
            textObjectView.setText("Score: " + score);
            if (score >= 1000) {
                nextClick.setVisibility(View.VISIBLE);
            }

        }

        //Punch Sound
        punch_sound.start();
    }

    public void beelzebubclick(View v) {
        View beelzebubclick = findViewById(R.id.Beelzebub);
        View luciferclick = findViewById(R.id.Lucifer);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
        View nextClick = findViewById(R.id.Next);

        Beelzebub.setHearts(Beelzebub.getHearts() - WuKong.getStrength());
        if(Beelzebub.getHearts() <= 0){
            beelzebubclick.setVisibility(View.GONE);
            score += 100;
            luciferclick.setVisibility(View.VISIBLE);
            iblisclick.setVisibility(View.VISIBLE);
            egynclick.setVisibility(View.VISIBLE);
            amaimonclick.setVisibility(View.VISIBLE);
            textObjectView.setText("Score: " + score);
            if (score >= 1000) {
                nextClick.setVisibility(View.VISIBLE);
            }
            }



        //Punch Sound
        punch_sound.start();
    }

    public void satanclick(View v) {
        View satanclick = findViewById(R.id.Satan);
        View luciferclick = findViewById(R.id.Lucifer);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
        View nextClick = findViewById(R.id.Next);

        Satan.setHearts(Satan.getHearts() - WuKong.getStrength());
        if(Satan.getHearts() <= 0){
            satanclick.setVisibility(View.GONE);
            score += 100;
            luciferclick.setVisibility(View.VISIBLE);
            iblisclick.setVisibility(View.VISIBLE);
            egynclick.setVisibility(View.VISIBLE);
            amaimonclick.setVisibility(View.VISIBLE);
            textObjectView.setText("Score: " + score);
            if (score >= 1000) {
                nextClick.setVisibility(View.VISIBLE);
            }
            }


        //Punch Sound
        punch_sound.start();
    }

    public void nextClick(View v){
        View nextClick = findViewById(R.id.Next);
        WuKong.setStrength(WuKong.getStrength() + 1);
        score = 0;

        nextClick.setVisibility(View.GONE);
        Toast.makeText(this, "YOU GOT STRONGER",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the help button.");
        Intent i;
    }

}
