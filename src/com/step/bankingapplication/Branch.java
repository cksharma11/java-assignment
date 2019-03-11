package com.step.bankingapplication;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String branchName;
    private List<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public String getBranchName() {
        return this.branchName;
    }
}
