package com.strobertchs.ics4u_finalproject_wukongshowdown;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

import static com.strobertchs.ics4u_finalproject_wukongshowdown.R.drawable.monkey;

public class GameActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    /*private final class TileOnTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View view, MotionEvent e) {
            float x = e.getX();
            float y = e.getY();
            switch (e.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    player.setX((int)e.getX());
                    break;
                case MotionEvent.ACTION_UP:
                    break;
                default:
                    break;
            }
            return true;
        }
    }*/
}
