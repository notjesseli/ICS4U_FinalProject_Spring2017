package com.strobertchs.ics4u_finalproject_wukongshowdown;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

    }

    Demon Lucifier = new Demon(1, 1);
    Demon Iblis = new Demon(1,1);
    Demon Egyn = new Demon(1,1);
    Demon Amaimon = new Demon(1,1);
    Demon Azazel = new Demon(2,1);
    Demon Mephisto = new Demon(2, 1);
    Demon Beelzebub = new Demon(2,1);
    Demon Satan = new Demon(2,1);
    Monkey WuKong = new Monkey(3, "WUKONG", 2, score);



    public void lucifierclick(View v) {
        View azazelclick = findViewById(R.id.Azazel);
        View luciferclick = findViewById(R.id.Lucifier);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
        Lucifier.setHearts(Lucifier.getHearts() - WuKong.getStrength());

        if(Lucifier.getHearts() <= 0) {
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
        }
    }

    public void iblisclick (View v) {
        View mephistoclick = findViewById(R.id.Mephisto);
        View luciferclick = findViewById(R.id.Lucifier);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
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
        }
    }

    public void egynclick(View v) {
        View beelzebubclick = findViewById(R.id.Beelzebub);
        View luciferclick = findViewById(R.id.Lucifier);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
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
        }
    }

    public void amaimonclick(View v) {
        View satanclick = findViewById(R.id.Satan);
        View luciferclick = findViewById(R.id.Lucifier);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);
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
        }
    }

    public void azazelclick(View v) {
        View azazelclick = findViewById(R.id.Azazel);
        View luciferclick = findViewById(R.id.Lucifier);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);

        Azazel.setHearts(Azazel.getHearts() - WuKong.getStrength());

        if(Azazel.getHearts() <= 0){
            azazelclick.setVisibility(View.GONE);
            score += 100;
            luciferclick.setVisibility(View.VISIBLE);
            iblisclick.setVisibility(View.VISIBLE);
            egynclick.setVisibility(View.VISIBLE);
            amaimonclick.setVisibility(View.VISIBLE);
        }


    }

    public void mephistoclick(View v) {
        View mephistoclick = findViewById(R.id.Mephisto);
        View luciferclick = findViewById(R.id.Lucifier);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);

        Mephisto.setHearts(Mephisto.getHearts() - WuKong.getStrength());

        if(Mephisto.getHearts() <= 0){
            mephistoclick.setVisibility(View.GONE);
            score += 100;
            luciferclick.setVisibility(View.VISIBLE);
            iblisclick.setVisibility(View.VISIBLE);
            egynclick.setVisibility(View.VISIBLE);
            amaimonclick.setVisibility(View.VISIBLE);
        }
    }

    public void beelzebubclick(View v) {
        View beelzebubclick = findViewById(R.id.Beelzebub);
        View luciferclick = findViewById(R.id.Lucifier);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);

        Beelzebub.setHearts(Beelzebub.getHearts() - WuKong.getStrength());
        if(Beelzebub.getHearts() <= 0){
            beelzebubclick.setVisibility(View.GONE);
            score += 100;
            luciferclick.setVisibility(View.VISIBLE);
            iblisclick.setVisibility(View.VISIBLE);
            egynclick.setVisibility(View.VISIBLE);
            amaimonclick.setVisibility(View.VISIBLE);
            }

    }

    public void satanclick(View v) {
        View satanclick = findViewById(R.id.Satan);
        View luciferclick = findViewById(R.id.Lucifier);
        View iblisclick = findViewById(R.id.Iblis);
        View egynclick = findViewById(R.id.Egyn);
        View amaimonclick = findViewById(R.id.Amaimon);

        Satan.setHearts(Satan.getHearts() - WuKong.getStrength());
        if(Satan.getHearts() <= 0){
            satanclick.setVisibility(View.GONE);
            score += 100;
            luciferclick.setVisibility(View.VISIBLE);
            iblisclick.setVisibility(View.VISIBLE);
            egynclick.setVisibility(View.VISIBLE);
            amaimonclick.setVisibility(View.VISIBLE);
            }
        }

}
