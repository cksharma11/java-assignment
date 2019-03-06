package com.step.assignment;

public class CalculatorForCarpetCost {
    private Floor floor;
    private Carpet carpet;

    public CalculatorForCarpetCost(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }
}
