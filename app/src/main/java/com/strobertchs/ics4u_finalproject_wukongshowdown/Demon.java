package com.strobertchs.ics4u_finalproject_wukongshowdown;

/**
 * Created by Jesse Li, Owen Chen, and Andrew Lin on 6/22/2017.
 */

public class Demon {

    private int hearts;
    private int strength;
    private int score;

    public Demon(int dhearts, int dstrength, int dscore)
    {
        hearts = dhearts;
        strength = dstrength;
        score = dscore;
    }

    public int getHearts(){
        return hearts;
    }

    public int getStrength(){
        return strength;
    }

    public int getScore(){
        return score;
    }

    public void setHearts(int h){
        hearts = h;
    }

    public void setStrength(int s){
        strength = s;
    }

    public void setScore(int sc){
        score = sc;
    }
}
