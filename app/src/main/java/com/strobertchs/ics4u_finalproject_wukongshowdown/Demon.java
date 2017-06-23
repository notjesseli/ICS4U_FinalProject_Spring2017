package com.strobertchs.ics4u_finalproject_wukongshowdown;

/**
 * Created by Jesse Li, Owen Chen, and Andrew Lin on 6/22/2017.
 */

public class Demon {

    /*
    * Initializing variable to represent hearts of demon objects.
     */

    private int hearts;

    /*
    * Initializing variable to represent strength of demon objects.
     */

    private int strength;

    /*
    * Constructor method used to initialize new demon objects.
    * @param demonHearts - Parameter used to set the initial amount of hearts in the demon object.
    * @param demonStrength - Parameter used to set the initial amount of strength in the demon object.
     */

    public Demon(int dHearts, int dStrength)
    {
        hearts = dHearts;
        strength = dStrength;
    }

    /*
    * Getter method used to return hearts.
    * @return - Returns the current amount of hearts in the demon object.
     */

    public int getHearts(){
        return hearts;
    }

    /*
    * Getter method used to return strength.
    * @return - Returns the current amount of strength in the demon object.
     */

    public int getStrength(){
        return strength;
    }

    /*
    * Setter method used to change the amount of hearts.
    * @param demonHearts - Parameter used to set the amount of hearts.
     */

    public void setHearts(int demonHearts){
        hearts = demonHearts;
    }

    /*
    * Setter method used to change the amount of strength.
    * @param demonStrength - Parameter used to set the amount of strength.
     */

    public void setStrength(int demonStrength){
        strength = demonStrength;
    }

}
