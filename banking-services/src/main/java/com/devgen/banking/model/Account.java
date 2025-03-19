package com.devgen.banking.model;

public class Account {

    /*
       Account Number : Unique , Auto generated

    */

    private long accountNumber;
    private double balance;
    private AccountType accountType;        //enum class:AccountType

    /*  private String accountType;
        it will accept All string value(e.g Dip) but you want specific input
        like "Current" and "saving":
        I want restricted set of things with named constant :Use Enum Class
     */


    public Account(long accountNumber, double balance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}

