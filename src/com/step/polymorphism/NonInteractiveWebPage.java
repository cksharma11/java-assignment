package com.step.polymorphism;

import java.util.Scanner;

public class NonInteractiveWebPage implements Display,Fetch{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        System.out.println("Enter the content you want to print :");
        String content = scanner.nextLine();
        System.out.println(content);
    }

    @Override
    public String fetchContent() {
        String conetnt = "This is dummy content for Non Interactive web page.";
        return conetnt;
    }

    public void click(){
        System.out.println("Click is not supported here!");
    }

}
