package com.step.assignment;

public class Car extends Vehicle {
    private int gears;

    public Car(int numberOfWheels, double speed, int gears) {
        super(numberOfWheels, speed);
        this.gears = gears;
    }

    public void changeGear(int gear){
        this.gears = gear;
        System.out.println("Current speed : "+this.gears);
    }
}
