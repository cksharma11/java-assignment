package com.step.bankingapplication;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Double> transections;

    public Customer(String name, double initialTransection) {
        this.name = name;
        this.transections = new ArrayList<>();
        transections.add(initialTransection);
    }

    public void addTransaction(double amount){
        this.transections.add(amount);
    }

    public void showTransactions(){
        this.transections.forEach(transection->{
            System.out.println(transection);
        });
    }
}
