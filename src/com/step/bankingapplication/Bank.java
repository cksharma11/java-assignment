package com.step.bankingapplication;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public void showBranches() {
        this.branches.forEach(branch -> {
            System.out.println(branch.getBranchName());
        });
    }

    public void addBranch(Branch branch){
        this.branches.add(branch);
    }
}
