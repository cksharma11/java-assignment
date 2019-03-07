package com.step.assignment;

public class Rectangle {
    private double width;
    private double length;


    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
        if(length < 0) this.length = 0;
        if(width < 0) this.width = 0;
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return this.width * this.length;
    }
}
