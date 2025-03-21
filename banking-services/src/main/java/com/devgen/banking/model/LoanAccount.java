package com.devgen.banking.model;

public class LoanAccount extends Account
{

    private final double interestRate = 0.1;

    public LoanAccount(long accountNumber, double balance, AccountType accountType)
    {
        super(accountNumber, balance, AccountType.LOAN);
    }


    public double getInterestRate()
    {
        return interestRate;
    }
}
