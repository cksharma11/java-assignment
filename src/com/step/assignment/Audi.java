package com.step.assignment;

public class Audi extends Car {
    public Audi(int numberOfWheels, double speed, int gears) {
        super(numberOfWheels, speed, gears);
    }

    public void fly(){
        System.out.println("Flying..");
    }
}
