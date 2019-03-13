package com.step.unocards;

public class Main {
    public static void main(String[] args) {
        UnoCard unoCard = new UnoCard(1, "red");
        IdentityCard chandan = new IdentityCard(12, "Chandan");

        DuplicateUnoCard duplicateUnoCard = new UnoCard(2,"green").duplicate();
        DuplicateIdentityCard duplicateIdentityCard = new IdentityCard(123,"Naman").duplicate();
    }
}
