package com.company;

/**
 * Created by GAGAN on 08/01/2018.
 */
public class Audi extends Car{
    private int roadServiceMonth;

    public Audi( int roadServiceMonth) {
        super("outLander","black", 5,5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }
    public void accelerate(int rate){
        int newVelocity=getCurrentVelocity()+rate;
        if (newVelocity==0){
            stop();
            changeGears(1);
        }
        else if (newVelocity>=0 &&newVelocity<=10)
        {
            changeGears(1);
        }
        else if (newVelocity>=10 &&newVelocity<=20)
        {
            changeGears(2);
        }
        else if (newVelocity>=20 &&newVelocity<=30)
        {
            changeGears(3);
        }
        else
        {
            changeGears(4);
        }
 if (newVelocity>0)
 {
     chngeVelocity(newVelocity,getCurrentDirection());
 }
    }
}
