package com.strobertchs.ics4u_finalproject_wukongshowdown;

/**
 * Created by Owen Chen, Jesse Li, and Andrew Lin on 2017-06-12.
 */

public class Monkey{

    /*
    * Initializing variable to represent hearts of monkey objects.
     */

    private int hearts;

    /*
    * Initializing variable to represent name of monkey objects.
     */

    private String name;

    /*
    * Initializing variable to represent strength of monkey objects.
     */

    private int strength;

    /*
    * Initializing variable to represent score.
     */

    private int score;

    /*
    * Constructor method used to initialize a monkey object.
    * @param mHearts - Parameter used to set the initial amount of hearts for the monkey object.
    * @param mName - Parameter used to set the initial name of the monkey object.
    * @param mStrength - Parameter used to set the initial amount of strength for the monkey object.
    * @param mScore - Parameter used to set hte initial score for the monkey object.
     */

    public Monkey(int mHearts, String mName,int mStrength, int mScore)
    {
        hearts = mHearts;
        name = mName;
        strength = mStrength;
        score = mScore;
    }

    /*
    * Getter method used to return hearts.
    * @return - Returns current amount of hearts in the monkey object.
    */

    public int getHearts(){
        return hearts;
    }

    /*
    * Getter method used to return name.
    * @return - Returns current name in the monkey object.
     */
    public String getName(){
        return name;
    }

    /*
    * Getter method used to return strength.
    * @return - Returns current amount of strength in the monkey object.
     */

    public int getStrength(){
        return strength;
    }

    /*
    * Getter method used to return score.
    * @return - Returns current score in the monkey object.
     */

    public int getScore(){
        return score;
    }

    /*
    * Setter method to change the number of starting hearts.
    * @param playerHearts - Parameter used to set the amount of hearts when calling the method.
     */

    public void setHearts(int playerHearts){
        hearts = playerHearts;
    }

    /*
    * Setter method used to change starting strength.
    * @param playerStrength - Parameter used to set the amount of strength when calling the method.
     */
    public void setStrength(int playerStrength){
        strength = playerStrength;
    }

    /*
    * Setter method used to change starting score.
    * @param playerScore - Parameter used to set the amount of score when calling the method.
     */

    public void setScore(int playerScore){
        score = playerScore;
    }

}
