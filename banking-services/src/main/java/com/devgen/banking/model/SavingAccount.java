package com.devgen.banking.model;

public class SavingAccount extends Account
{
    public SavingAccount(long accountNumber, double balance)
    {
        super(accountNumber, balance, AccountType.SAVING);
    }

}
