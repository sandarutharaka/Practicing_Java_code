package com.mycompany.savingobj;
public class Savingobj {

    public static void main(String[] args) 
    {
        SavingAccount saver1=new SavingAccount(2000);
        SavingAccount saver2=new SavingAccount(3000);
        SavingAccount.annualInterestRate=0.04;
        saver1.calMonInterest();
        saver2.calMonInterest();
        System.out.println("sarver1 balnce "+saver1.getbalance());
        System.out.println("sarver2 balnce "+saver2.getbalance());
        SavingAccount.modifyInterestRate(0.05);
        saver1.calMonInterest();
        saver2.calMonInterest();
        System.out.println("next month sarver 1 balance "+saver1.getbalance());
        System.out.println("next month sarver 2 balance "+saver2.getbalance());
    }
}

