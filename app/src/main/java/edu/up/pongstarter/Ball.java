package edu.up.pongstarter;

import android.graphics.Color;
import java.util.ArrayList;

/**
 * @author Alexa Baldwin
 * @version 2/27/2016
 */

/**
 * Ball class
 * Each ball has an x-coordinate, y-coordinate, radius,
 * x-speed, y-speed and color.
 */
public class Ball {
    protected int color;
    protected int xCoor;
    protected int yCoor;
    protected int rad;
    protected int xSpeed;
    protected boolean onScreen;
    protected int ySpeed;
    protected int wallWidth = 50;

    /**
     * Ball constructor - initializes instance variables
     */
    public Ball () {
        xCoor = getRandWidth();
        yCoor = getRandHeight();
        xSpeed = (int)(Math.random()*60)+10;
        ySpeed = (int)(Math.random()*60)+10;
        this.rad = 60;
        this.color = Color.WHITE;
        onScreen=true;
    }

    /**
     * getRandHeight creates a random number based on the height of the canvas
     * @return a random number for the height
     */
    public int getRandHeight() {
        int rand = (int)(Math.random()*(1294-wallWidth-rad));
        return (rand+(wallWidth+rad));
    }

    /**
     * getRandWidth creates a random number based on the width of the canvas
     * @return a random number for the width
     */
    public int getRandWidth() {
        int rand = (int)(Math.random()*(1500-wallWidth-rad));
        return (rand+(wallWidth+rad));
    }

    /**
     * addBall adds a ball to the ArrayList of Balls from BallAnimator
     * @param abl an ArrayList of Ball objects
     */
    public void addBall(ArrayList<Ball> abl) {
        abl.add(this);
    }

    /**
     * reset ball - this method gets called when the ball exits the
     * playing field and resets the ball's position and velocity randomly
     */
    public void resetBall() {
        xCoor = getRandWidth();
        yCoor = getRandHeight();
        xSpeed = (int)(Math.random()*60)+10;
        ySpeed = (int)(Math.random()*60)+10;
    }

    /**
     * setxSpeed - resets the x-speed
     * @param newSpeed new speed for the ball
     */
    public void setxSpeed(int newSpeed) {
        xSpeed = newSpeed;
    }

    /**
     * setySpeed - resets the y-speed
     * @param newSpeed new speed for the ball
     */
    public void setySpeed(int newSpeed) {
        ySpeed = newSpeed;
    }

    /**
     * setxCoor - resets the x-coordinate
     * @param newCoor new x-coor for the ball
     */
    public void setxCoor(int newCoor) {
        xCoor = newCoor;
    }

    /**
     * setyCoor - resets the y-coordinate
     * @param newCoor new y-coor for the ball
     */
    public void setyCoor(int newCoor) {
        yCoor = newCoor;
    }

    /**
     * setRadius - resets the ball's radius
     * @param newRad new radius for the ball
     */
    public void setRadius(int newRad) { rad = newRad; }
}
