package com.step.range;

public class Main {
    public static void main(String[] args) {
        NumberRange numberRange = new NumberRange(1, 10);
        System.out.println(numberRange.getAll());
        System.out.println(numberRange.containsElement(1));
        System.out.println(numberRange.containsElement(11));

        System.out.println("******************************");

        CharacterRange alphabetRange = new CharacterRange('a', 'g');
        System.out.println(alphabetRange.getAll());
        System.out.println(alphabetRange.containsElement('c'));
        System.out.println(alphabetRange.containsElement('z'));

    }
}
