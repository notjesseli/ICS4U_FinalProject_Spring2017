package com.strobertchs.ics4u_finalproject_wukongshowdown;

/**
 * Created by Owen Chen, Jesse Li, and Andrew Lin on 2017-06-12.
 */

public class Monkey{

    private int hearts;
    private String name;
    private int strength;
    private int score;

    public Monkey(int mhearts, String mname,int mstrength, int mscore)
    {
        hearts = mhearts;
        name = mname;
        strength = mstrength;
        score = mscore;
    }

    public int getHearts(){
        return hearts;
    }

    public String getName(){
        return name;
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
