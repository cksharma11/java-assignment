package com.step.assignment;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(decimalComparator(-10.112, 10.112));
    }

    private static boolean decimalComparator(double a, double b){
        return a*1000 == b*1000;
    }
}