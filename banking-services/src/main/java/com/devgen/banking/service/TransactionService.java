package com.devgen.banking.service;

import com.devgen.banking.model.Account;
import com.devgen.banking.model.AccountType;
import com.devgen.banking.model.CurrentAccount;


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


    public boolean withdraw(Long accountNumber,double amount)
    {

        Account account = accountService.getAccount(accountNumber);

        double newBalance = 0;

        if(account.getAccountType()== AccountType.SAVING){
            newBalance = account.getBalance()-amount;

        } else if (account.getAccountType()==AccountType.CURRENT) {
            CurrentAccount currentAccount=(CurrentAccount)account;
            newBalance = account.getBalance()+((CurrentAccount) account).getOverDraftLimit() - amount;
        }

        if(newBalance<0){
            System.out.println("Insufficient Balance");
            return false;
        }

        account.updateBalance(newBalance);
        return true;
    }




}
