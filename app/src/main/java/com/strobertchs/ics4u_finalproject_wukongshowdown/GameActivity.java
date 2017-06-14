package com.strobertchs.ics4u_finalproject_wukongshowdown;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.io.IOException;
import java.util.Random;

import static com.strobertchs.ics4u_finalproject_wukongshowdown.R.attr.background;

public class GameActivity extends SurfaceView{

    Canvas canvas;
    Thread ourThread = null;
    SurfaceHolder ourHolder;
    volatile boolean playingGame;
    Paint paint;
    Monkey monkey;
    Bitmap backgroundimg;

    long lastFrameTime;
    int fps;
    int score;
    int lives;
    int screenWidth;
    int screenHeight;

    //Sound variables
    private SoundPool soundPool;
    int sample1 = -1;
    int sample2 = -1;
    int sample3 = -1;
    int sample4 = -1;
    int andIMissYou  = -1;
    int videoGameDeathSound = -1;
    int Paddle_ball_hit_1 = -1;

    public GameActivity(Context context, int sScreenWidth, int sScreenHeight) {

        super(context);

        screenWidth = sScreenWidth;
        screenHeight = sScreenHeight;
        ourHolder = getHolder();
        paint = new Paint();
        Resources res = getResources();
        backgroundimg = BitmapFactory.decodeResource(res, background);

        lives = 3;
        score = 0;

        //Sound code
        soundPool = new SoundPool(10,
                AudioManager.STREAM_MUSIC, 0);
        try {
            //Create objects of the 2 required classes
            AssetManager assetManager = context.getAssets();
            AssetFileDescriptor descriptor;

            //create our five fx in memory ready for use
            descriptor =
                    assetManager.openFd("sample1.ogg");
            sample1 = soundPool.load(descriptor, 0);
            descriptor =
                    assetManager.openFd("sample2.ogg");
            sample2 = soundPool.load(descriptor, 0);
            descriptor =
                    assetManager.openFd("sample3.ogg");
            sample3 = soundPool.load(descriptor, 0);
            descriptor =
                    assetManager.openFd("sample4.ogg");
            sample4 = soundPool.load(descriptor, 0);
            descriptor =
                    assetManager.openFd("andIMissYou.ogg");
            andIMissYou = soundPool.load(descriptor, 0);
            descriptor =
                    assetManager.openFd("videoGameDeathSound.ogg");
            videoGameDeathSound = soundPool.load(descriptor, 0);
            descriptor =
                    assetManager.openFd("Paddle_ball_hit_1.ogg");
            Paddle_ball_hit_1 = soundPool.load(descriptor, 0);
        } catch (IOException e) {
            //catch exceptions here
        }

    }

    public void run() {
        while (playingGame) {
            updateCourt();
            drawCourt();
            controlFPS();
        }
    }

    public void updateCourt() {

        // move racket only if it is not at the edge of the screen

        if (monkey.isMovingRight()) {
            if(monkey.getPositionX() + monkey.getWidth()/2 < screenWidth){ //move right only if you haven't hit the right edge
                monkey.updatePosition();
            }
        }

        if (monkey.isMovingLeft()) {
            if (monkey.getPositionX() - monkey.getWidth()/2 > 0){  //move left only if you haven't hit the left edge
                monkey.updatePosition();
            }
        }

    }

    public void drawCourt() {
        if (ourHolder.getSurface().isValid()) {
            canvas = ourHolder.lockCanvas();
            canvas.drawColor(Color.BLACK);//the background
            canvas.drawBitmap(backgroundimg, 0, 0, paint);//Draws the bitmap to the canvas
            Paint paint = new Paint();
            paint.setColor(Color.argb(255, 255, 255, 255));
            paint.setTextSize(45);
            canvas.drawText("Score:" + score + " Lives:" + lives + " fps:" + fps, 20, 40, paint);

            //Draw the monkey
            monkey.draw(canvas);
            ourHolder.unlockCanvasAndPost(canvas);
        }
    }


    public void controlFPS() {
        long timeThisFrame = (System.currentTimeMillis() - lastFrameTime);
        long timeToSleep = 15 - timeThisFrame;
        if (timeThisFrame > 0) {
            fps = (int) (1000 / timeThisFrame);
        }
        if (timeToSleep > 0) {
            try {
                ourThread.sleep(timeToSleep);
            } catch (InterruptedException e) {
            }
        }
        lastFrameTime = System.currentTimeMillis();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                if (motionEvent.getX() >= screenWidth / 2) {
                    monkey.moveRight();
                } else {
                    monkey.moveLeft();
                }
                break;

            case MotionEvent.ACTION_UP:
                monkey.stop();
                break;
        }
        return true;
    }

}
