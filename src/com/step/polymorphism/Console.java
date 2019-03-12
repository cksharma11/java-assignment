package com.step.polymorphism;

import java.util.Scanner;

public class Console implements Displayable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        System.out.println("Enter the content you want to print :");
        String content = scanner.nextLine();
        System.out.println(String.format("Your content : %s", content));
    }
}
