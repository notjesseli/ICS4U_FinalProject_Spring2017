package com.strobertchs.ics4u_finalproject_wukongshowdown;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

    }


    public void demon1(View v) {
        View pdemonclick1 = findViewById(R.id.pdemonup);
        View demonclick1 = findViewById(R.id.demonup);
        View demonclick2 = findViewById(R.id.demondown);
        View demonclick3 = findViewById(R.id.demonleft);
        View demonclick4 = findViewById(R.id.demonright);

        demonclick1.setVisibility(View.GONE);

        Random num = new Random();
        int rannum = num.nextInt(4) + 1;

        if(rannum == 1){
            pdemonclick1.setVisibility(View.VISIBLE);
        }
        else if(rannum == 2){
            demonclick2.setVisibility(View.VISIBLE);
        }
        else if(rannum == 3){
            demonclick3.setVisibility(View.VISIBLE);
        }
        else if (rannum == 4){
            demonclick4.setVisibility(View.VISIBLE);
        }

    }

    public void demon2(View v) {
        View demonclick1 = findViewById(R.id.demonup);
        View demonclick2 = findViewById(R.id.demondown);
        View pdemonclick2 = findViewById(R.id.pdemondown);
        View demonclick3 = findViewById(R.id.demonleft);
        View demonclick4 = findViewById(R.id.demonright);

        demonclick2.setVisibility(View.GONE);

        Random num = new Random();
        int rannum = num.nextInt(4) + 1;

        if(rannum == 1){
            demonclick1.setVisibility(View.VISIBLE);
        }
        else if(rannum == 2){
            pdemonclick2.setVisibility(View.VISIBLE);
        }
        else if(rannum == 3){
            demonclick3.setVisibility(View.VISIBLE);
        }
        else if (rannum == 4){
            demonclick4.setVisibility(View.VISIBLE);
        }
    }

    public void demon3(View v) {
        View demonclick1 = findViewById(R.id.demonup);
        View demonclick2 = findViewById(R.id.demondown);
        View demonclick3 = findViewById(R.id.demonleft);
        View pdemonclick3 = findViewById(R.id.pdemonleft);
        View demonclick4 = findViewById(R.id.demonright);

        demonclick3.setVisibility(View.GONE);

        Random num = new Random();
        int rannum = num.nextInt(4) + 1;

        if(rannum == 1){
            demonclick1.setVisibility(View.VISIBLE);
        }
        else if(rannum == 2){
            demonclick2.setVisibility(View.VISIBLE);
        }
        else if(rannum == 3){
            pdemonclick3.setVisibility(View.VISIBLE);
        }
        else if (rannum == 4){
            demonclick4.setVisibility(View.VISIBLE);
        }
    }

    public void demon4(View v) {
        View demonclick1 = findViewById(R.id.demonup);
        View demonclick2 = findViewById(R.id.demondown);
        View demonclick3 = findViewById(R.id.demonleft);
        View demonclick4 = findViewById(R.id.demonright);
        View pdemonclick4 = findViewById(R.id.pdemonright);

        demonclick4.setVisibility(View.GONE);

        Random num = new Random();
        int rannum = num.nextInt(4) + 1;

        if(rannum == 1){
            demonclick1.setVisibility(View.VISIBLE);
        }
        else if(rannum == 2){
            demonclick2.setVisibility(View.VISIBLE);
        }
        else if(rannum == 3){
            demonclick3.setVisibility(View.VISIBLE);
        }
        else if (rannum == 4){
            pdemonclick4.setVisibility(View.VISIBLE);
        }
    }

    public void pdemon1(View v) {
        View pdemonclick1 = findViewById(R.id.pdemonup);
        View demonclick1 = findViewById(R.id.demonup);
        View demonclick2 = findViewById(R.id.demondown);
        View demonclick3 = findViewById(R.id.demonleft);
        View demonclick4 = findViewById(R.id.demonright);

        pdemonclick1.setVisibility(View.GONE);

        demonclick2.setVisibility(View.VISIBLE);
        demonclick3.setVisibility(View.VISIBLE);
        demonclick4.setVisibility(View.VISIBLE);
    }

    public void pdemon2(View v) {
        View demonclick1 = findViewById(R.id.demonup);
        View demonclick2 = findViewById(R.id.demondown);
        View pdemonclick2 = findViewById(R.id.pdemondown);
        View demonclick3 = findViewById(R.id.demonleft);
        View demonclick4 = findViewById(R.id.demonright);

        pdemonclick2.setVisibility(View.GONE);

        demonclick1.setVisibility(View.VISIBLE);
        demonclick3.setVisibility(View.VISIBLE);
        demonclick4.setVisibility(View.VISIBLE);
    }

    public void pdemon3(View v) {
        View demonclick1 = findViewById(R.id.demonup);
        View demonclick2 = findViewById(R.id.demondown);
        View demonclick3 = findViewById(R.id.demonleft);
        View pdemonclick3 = findViewById(R.id.pdemonleft);
        View demonclick4 = findViewById(R.id.demonright);

        pdemonclick3.setVisibility(View.GONE);

        demonclick1.setVisibility(View.VISIBLE);
        demonclick2.setVisibility(View.VISIBLE);
        demonclick4.setVisibility(View.VISIBLE);
    }

    public void pdemon4(View v) {
        View demonclick1 = findViewById(R.id.demonup);
        View demonclick2 = findViewById(R.id.demondown);
        View demonclick3 = findViewById(R.id.demonleft);
        View demonclick4 = findViewById(R.id.demonright);
        View pdemonclick4 = findViewById(R.id.pdemonright);

        pdemonclick4.setVisibility(View.GONE);

        demonclick1.setVisibility(View.VISIBLE);
        demonclick2.setVisibility(View.VISIBLE);
        demonclick3.setVisibility(View.VISIBLE);
    }


}
