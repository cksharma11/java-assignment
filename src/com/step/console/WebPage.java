package com.step.console;

import java.util.Scanner;

public class WebPage implements Display,Fetch{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        System.out.println("Enter the content you want to print :");
        String content = scanner.nextLine();
        System.out.println(content);
    }

    @Override
    public String fetchContent() {
        String conetnt = "This is dummy content for WebPage.";
        return conetnt;
    }

    public void click(){
        System.out.println("I'm clicked!");
    }
}
