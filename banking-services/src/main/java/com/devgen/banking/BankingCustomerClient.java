package com.devgen.banking;

import com.devgen.banking.model.Account;
import com.devgen.banking.model.AccountType;
import com.devgen.banking.model.CurrentAccount;
import com.devgen.banking.service.AccountService;

public class BankingCustomerClient {

    //Console Based Client(No frontend involved)

    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        //it will return Account Number
        long accountNumber =accountService.createAccount(3000, AccountType.SAVING);

        //get Details of account using returned Account Number
        //return details from Map
        Account account=accountService.getAccount(accountNumber);

        //Print account Details
        System.out.println("Account Number : " + account.getAccountNumber() + " " + "" +
                "Balance : " + account.getBalance()+" Account type : "+account.getAccountType());


        long accountNumber1 =accountService.createAccount(5000.0, AccountType.SAVING);
        Account account1=accountService.getAccount(accountNumber1);
        System.out.println("Account Number : " + account1.getAccountNumber() + " " + "" +
                "Balance : " + account1.getBalance() +" Account type : "+account1.getAccountType());

        //To get Overdraft Facility : Need TypeCasting

        long accountNumber2 =accountService.createAccount(2000.0, AccountType.CURRENT);
        Account account2=accountService.getAccount(accountNumber2);
        CurrentAccount currentAccount = (CurrentAccount)account2; //DownCast

        System.out.println("Account Number : " + account2.getAccountNumber() + "" +

                "Balance : " + account2.getBalance()
                +" Account type : "+account2.getAccountType()
        +"  OverDraft Limit : "+currentAccount.getOverDraftLimit());






    }
}
