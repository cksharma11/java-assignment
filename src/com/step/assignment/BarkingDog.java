package com.step.assignment;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,10));
        System.out.println(shouldWakeUp(false,1));
        System.out.println(shouldWakeUp(true,7));
        System.out.println(shouldWakeUp(true,-10));
    }

    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfTheDay){
            if(isDogBarking){
                if(hourOfTheDay<8 && hourOfTheDay >= 0|| hourOfTheDay>22 && hourOfTheDay <=23){
                    return true;
                }
            }
        return false;
    }
}