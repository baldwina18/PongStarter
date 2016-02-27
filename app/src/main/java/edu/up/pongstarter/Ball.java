package edu.up.pongstarter;

import android.graphics.Color;

import java.util.ArrayList;

/**
 * Created by alexabaldwin on 2/27/16.
 */
public class Ball {
    protected int color;
    protected int xCoor;
    protected int yCoor;
    protected int rad;
    protected int xSpeed;
    protected int ySpeed;


    public Ball () {
        xCoor = getRandWidth();
        yCoor = getRandHeight();
        xSpeed = (int)(Math.random()*60)+10;
        ySpeed = (int)(Math.random()*60)+10;
        this.rad = 60;
        this.color = Color.WHITE;
    }

    public int getRandHeight() {
        int rand = (int)(Math.random()*(1294-50-rad)); //fix this so that it uses the canvas size
        return rand+(50+rad);
    }

    public int getRandWidth() {
        int rand = (int)(Math.random()*(2048-50-rad)); //fix this so that it uses the canvas size
        return rand+(50+rad);
    }

    public void addBall(ArrayList<Ball> abl) {
        abl.add(this);
    }


    public void resetBall() {

        xCoor = getRandHeight();
        yCoor = getRandWidth();
        xCoor = (int)(Math.random()*60)+10;
        yCoor = (int)(Math.random()*60)+10;
    }

    public void setxSpeed(int newSpeed) {
        xSpeed = newSpeed;
    }

    public void setySpeed(int newSpeed) {
        ySpeed = newSpeed;
    }

    public void setxCoor(int newCoor) {
        xCoor = newCoor;
    }

    public void setyCoor(int newCoor) {
        yCoor = newCoor;
    }

}
