package com.mycompany.savingobj;
public class SavingAccount 
{  
    public double savingbalance;
    static double annualInterestRate;
     
    public SavingAccount(double sbalance)
    {
        savingbalance=sbalance;
    }
    
    public void calMonInterest()
    { 
       double monthint=(savingbalance*annualInterestRate)/12;
       savingbalance=savingbalance+monthint;
     
     }
    public static void modifyInterestRate(double newRate)
    {
        annualInterestRate=newRate;
    }
    public double getbalance()
            {
                return savingbalance;
            }
    
}
