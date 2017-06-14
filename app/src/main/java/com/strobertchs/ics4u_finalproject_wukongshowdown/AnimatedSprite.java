package com.strobertchs.ics4u_finalproject_wukongshowdown;

/**
 * Created by Eric on 2017-05-09.
 * Edited by Jesse Li, Owen Chen, and Andrew Lin
 * Abstract class outlining the attributes & behaviours of moving game pieces
 */

public abstract class AnimatedSprite extends Sprite {
    private boolean movingLeft;     // LEFT Boolean
    private boolean movingRight;    // RIGHT Boolean
    private boolean movingUp;       // UP Boolean
    private boolean movingDown;     // DOWN Boolean
    private int up_amount;          // How much the projectile moves upward

    /**
     * Constructor - just calls the parent constructor
     */
    public AnimatedSprite(){
        super();
    }

    /**
     * movingLeft getter
     * @return true if intended direction is left
     */
    public boolean isMovingLeft() {
        return movingLeft;
    }

    /**
     * movingRight getter
     * @return true if intended direction is right
     */
    public boolean isMovingRight() {
        return movingRight;
    }

    /**
     * movingRight setter
     * @param movingRight true to set the intended direction right
     */
    public void setMovingRight(boolean movingRight) {
        this.movingRight = movingRight;
    }

    /**
     * movingLeft setter
     * @param movingLeft true to set the intended direction left
     */
    public void setMovingLeft(boolean movingLeft) {
        this.movingLeft = movingLeft;
    }

    /**
     * movingUp getter
     * @return true when intended vertical direction is up
     */
    public boolean isMovingUp() {
        return movingUp;
    }

    /**
     * movingDown getter
     * @return true when intended vertical direction is down
     */
    public boolean isMovingDown() {
        return movingDown;
    }


    /**
     * getter for up_amount, the number of pixels moving upwards
     * @return
     */
    public int getUp_amount() {
        return up_amount;
    }


    /**
     * setter for up_amount, the number of pixels moving upwards
     * @param up_amount
     */
    public void setUp_amount(int up_amount) {
        this.up_amount = up_amount;
    }


    /**
     * set the intended direction to the right
     */
    public void moveRight(){
        movingRight = true;
        movingLeft = false;
    }


    /**
     * set the intended direction to the left
     */
    public void moveLeft(){
        movingRight = false;
        movingLeft = true;
    }


    /**
     * moveUp: indicate the ball to move up
     */
    public void moveUp(){
        movingUp = true;
        movingDown = false;
    }


    /**
     * moveDown: indicate the ball to move down
     */
    public void moveDown(){
        movingUp = false;
        movingDown = true;
    }


    /**
     * updatePosition - apply the horizontal & vertical amounts based on current direction flags
     */
    public abstract void updatePosition();

}
