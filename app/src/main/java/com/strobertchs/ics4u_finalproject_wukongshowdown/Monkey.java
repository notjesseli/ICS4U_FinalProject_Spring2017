package com.strobertchs.ics4u_finalproject_wukongshowdown;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;

import java.util.ArrayList;

/**
 * Created by Owen Chen, Jesse Li, and Andrew Lin on 2017-06-12.
 */

public class Monkey extends AnimatedSprite {
    protected Bitmap bitmapRacket;
    protected int frameNumber;
    protected int frameHeight;
    protected int frameWidth;
    protected int numFrames;
    protected ArrayList<Bitmap> racketImage;


    /**
     * Constructor
     * @param context Connects the method to the drawable folder
     * @param screen_width The width of the devices screen
     * @param screen_height The Height of the devices screen
     **/

    public Monkey(Context context, int screen_width, int screen_height){
        super(); //Constructor from Sprite

        setPositionX(screen_width / 2);
        setPositionY(screen_height - 20);
        setHorizontal_amount(10);

        setWidth(screen_width / 6);
        setHeight(15);

        bitmapRacket = BitmapFactory.decodeResource(context.getResources(), R.drawable.moon);

        frameHeight = bitmapRacket.getHeight();
        frameWidth = bitmapRacket.getWidth();

        racketImage = new ArrayList<>();

        racketImage.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.moon));

        numFrames = racketImage.size();

        frameNumber++; //advance the frame count
    }

    /**
     * stop horizontal movement
     */
    public void stop(){
        setMovingLeft(false);
        setMovingRight(false);
    }

    /**
     * update the position of the racket based on intended direction
     */
    public void updatePosition(){
        if(isMovingRight()){
            setPositionX(getPositionX() + getHorizontal_amount());
        }

        if(isMovingLeft()){
            setPositionX(getPositionX() - getHorizontal_amount());
        }
    }


    public void draw(Canvas source_canvas){
        // compute the rectangle to draw the image to
        Rect destRect = new Rect(getPositionX() - (getWidth() / 2),
                getPositionY() - (getHeight() / 2),
                getPositionX() + (getWidth() /2 ),
                getPositionY() + getHeight());
        //source_canvas.drawBitmap(bitmap, null, destRect, null);  //show a single image
        source_canvas.drawBitmap(racketImage.get(frameNumber%numFrames), null, destRect, null);

    }
}
