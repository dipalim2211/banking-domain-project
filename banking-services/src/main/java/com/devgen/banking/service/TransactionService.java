package com.devgen.banking.service;

import com.devgen.banking.model.Account;


public class TransactionService {

    //Use : Withdraw , Deposit

    private AccountService accountService ;


    public  TransactionService(AccountService accountService)
    {
        this.accountService=accountService; //Set account service passed externally
    }

    public void deposit(Long accountNumber,double amount)
    {

      Account account = accountService.getAccount(accountNumber); //Accountservice check acc no by getAccount
        //give information in account object

        double newBalance = account.getBalance()+amount;

        account.updateBalance(newBalance);
    }


    public void withdraw(Long accountNumber,double amount)
    {


        Account account = accountService.getAccount(accountNumber); //Accountservice check acc no by getAccount
        //give information in account object

        double newBalance = account.getBalance()-amount;

        account.updateBalance(newBalance);
    }




}
