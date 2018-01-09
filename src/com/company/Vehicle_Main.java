package com.company;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class Vehicle_Main {
    public static void main(String args[]) {
        Audi audi = new Audi(36);
        audi.steer(60);
        audi.accelerate(20);
        audi.accelerate(30);
        audi.accelerate(-43);

    }
}
