package edu.up.pongstarter;

import android.graphics.Color;
import java.util.ArrayList;

/**
 * @author Alexa Baldwin
 * @version 03/04/2016
 */

/**
 * Ball class
 * Each ball has an x-coordinate, y-coordinate, radius,
 * x-speed, y-speed and color. The onScreen boolean determines
 * if the ball is still visible to the user
 */
public class Ball {
    protected int color;            //color of ball
    protected int xCoor;            //x coordinate of ball
    protected int yCoor;            //y coordinate of ball
    protected int rad;              //radius of ball
    protected int xSpeed;           //x speed of ball
    protected boolean onScreen;     //tells if ball is on screen or not
    protected int ySpeed;           //y speed of ball
    protected int wallWidth = 50;   //width of walls

    /**
     * Ball constructor - initializes instance variables
     */
    public Ball () {
        xCoor = getRandWidth();
        yCoor = getRandHeight();
        xSpeed = (int)(Math.random()*20)+30;
        ySpeed = (int)(Math.random()*20)+30;
        this.rad = 45;
        this.color = Color.WHITE;
        onScreen=true;
        addDirection();
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
        int rand = (int)(Math.random()*1000)+500;
        return rand;
    }

    /**
     * addBall adds a ball to the ArrayList of Balls from BallAnimator
     * @param abl an ArrayList of Ball objects
     */
    public void addBall(ArrayList<Ball> abl) {
        abl.add(this);
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

    /**
     * addDirection - determines the sign on the velocity of the balls
     */
    public void addDirection() {
        double rand = Math.random();
        if(rand<.25) {
            xSpeed *= -1;
            ySpeed *= -1;
        } else if (rand <.5) {
            xSpeed *= -1;
        } else if (rand <.75) {
            ySpeed *= -1;
        } else {}
    }

}
