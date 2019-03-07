package com.step.assignment;

public class Vehicle {
    private int numberOfWheels;
    private double speed;

    public Vehicle(int numberOfWheels, double speed) {
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
    }

    public void increaseSpeed(){
        this.speed++;
        System.out.println("Current speed : "+this.speed);
    }

    public void decreaseSpeed(){
        this.speed--;
        System.out.println("Current speed : "+this.speed);
    }
}
