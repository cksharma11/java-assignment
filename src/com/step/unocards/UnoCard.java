package com.step.unocards;

public class UnoCard implements Duplicable<DuplicateUnoCard> {
    private int number;
    private String color;

    public UnoCard(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public DuplicateUnoCard duplicate() {
        return new DuplicateUnoCard(number,color);
    }
}
