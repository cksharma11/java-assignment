package com.step.assignment;

public class Bike extends Vehicle {
    private int gear;

    public Bike(int numberOfWheels, double speed, int gear) {
        super(numberOfWheels, speed);
        this.gear = gear;
    }

    public void changeGear(int gear){
        this.gear = gear;
        System.out.println("Current gear : "+this.gear);
    }
}
