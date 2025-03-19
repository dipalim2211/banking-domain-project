package com.devgen.banking.model;

public class CurrentAccount extends Account{

    //Current Account provide OverDraft of 500rs

    private final double overDraftLimit = 500;

    public CurrentAccount(long accountNumber, double balance) {
        super(accountNumber, balance, AccountType.CURRENT);
    }

    //retrieve overDraftLimit
    public double getOverDraftLimit() {
        return overDraftLimit;
    }





}
