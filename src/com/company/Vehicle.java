package com.company;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class Vehicle {
    String type;
    String color;
    int currentDirection;
    int currentVelocity;
    public Vehicle(String type,String color){
       this.type=type;
       this.color=color;
       this.currentDirection=0;
       this.currentVelocity=0;
    }
   public void steer(int direction){
        this.currentDirection+=direction;
       System.out.println("vehicle.steer() is at diection of"+currentDirection);
   }


    public void move(int velocity, int direction){
      currentDirection=direction;
      currentVelocity=velocity;
        System.out.println("vehicle.move() moving at velocity of "+currentVelocity+"in direction "+currentDirection);
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
    public void stop()
    {
        this.currentVelocity=0;
    }
}
