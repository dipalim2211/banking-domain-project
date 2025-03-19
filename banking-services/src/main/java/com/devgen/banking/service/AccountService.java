package com.devgen.banking.service;

import com.devgen.banking.model.Account;
import com.devgen.banking.model.AccountType;
import com.devgen.banking.model.CurrentAccount;
import com.devgen.banking.model.SavingAccount;

import java.util.HashMap;

public class AccountService {

    private HashMap<Long, Account> accountMap1 ; //Super class reference

    private long autoAccountNumber ;

    //Constructor : Object Initialisation

    public AccountService()
    {
        accountMap1 = new HashMap<>();      //Subclass object : Loose Couple
        autoAccountNumber = 1L;
    }


    /*
    CreateAccount Method using info of deposit money(Balance)
    Return Account Number(System Generated)
    input : Balance , Current or Saving
     */

    public long createAccount(double balance, AccountType accountType){

        Account account = null;
        if(accountType == AccountType.SAVING){

            account = new SavingAccount(autoAccountNumber,balance);
            //RunTime Polymorphism: Changing Object Value based on type of Account

        } else if (accountType == AccountType.CURRENT) {

           account = new CurrentAccount(autoAccountNumber,balance);

        }
        accountMap1.put(autoAccountNumber,account);

        autoAccountNumber++;

        return autoAccountNumber-1;

    }

    //Get Account Detail on Account Number

    public Account getAccount(Long autoAccountNumber){

        return accountMap1.get(autoAccountNumber);

    }



}
