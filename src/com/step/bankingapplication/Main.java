package com.step.bankingapplication;

public class Main {
    public static void main(String[] args) {
        Bank punjab_national_bank = new Bank("Punjab National Bank");

        Branch nangloi = new Branch("Nangloi");
        Branch unitedKingdom = new Branch("United Kingdom");
        Branch dehradun = new Branch("Dehradun");
        Branch mumbai = new Branch("Mumbai");

        Customer gaurav = new Customer("Gaurav", 1000D);
        Customer dheeraj = new Customer("Dheeraj", 1000D);
        Customer ankon = new Customer("Ankon", 1000D);
        Customer naman = new Customer("Naman", 1000D);

        ankon.addTransaction(1000D);
        ankon.addTransaction(1000D);
        ankon.addTransaction(1000D);

        dheeraj.addTransaction(2000D);
        dheeraj.addTransaction(2000D);
        dheeraj.addTransaction(2000D);

        naman.addTransaction(1500D);
        naman.addTransaction(1500D);
        naman.addTransaction(1500D);

        nangloi.addCustomer(ankon);
        nangloi.addCustomer(dheeraj);
        unitedKingdom.addCustomer(gaurav);
        unitedKingdom.addCustomer(naman);

        punjab_national_bank.addBranch(nangloi);
        punjab_national_bank.addBranch(unitedKingdom);
        punjab_national_bank.addBranch(dehradun);
        punjab_national_bank.addBranch(mumbai);

        punjab_national_bank.showBranches();
        gaurav.showTransactions();
        dheeraj.showTransactions();
    }
}
