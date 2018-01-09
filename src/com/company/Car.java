package com.company;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class Car extends Vehicle {
    private int wheels;
    int doors;
    int gears;
    boolean isManual;
    int currentGear;

    public Car(String type, String color, int wheels, int doors, int gears, boolean isManual) {
        super(type, color);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear=1;
    }

    public void changeGears(int gears) {
        this.gears = gears;
        System.out.println("car.setcurrentGear is changed to "+currentGear+" Gear");
    }
    public void chngeVelocity(int speed,int direction)
    {
       move(speed,direction);
        System.out.println("car.changevelocity():velocity "+speed+" direction"+direction);
    }
}
