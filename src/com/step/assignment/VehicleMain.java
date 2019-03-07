package com.step.assignment;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car(4,60,5);
        Bike bike = new Bike(2,50,4);
        Audi audi = new Audi(4,100,8);
        Vehicle vehicle = new Vehicle(4,90);

        car.changeGear(2);
        bike.changeGear(3);
        audi.fly();
        vehicle.increaseSpeed();
        vehicle.increaseSpeed();
        vehicle.decreaseSpeed();
    }
}
