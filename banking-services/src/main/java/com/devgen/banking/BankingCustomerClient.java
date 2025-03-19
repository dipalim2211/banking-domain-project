package com.devgen.banking;

import com.devgen.banking.model.Account;
import com.devgen.banking.model.AccountType;
import com.devgen.banking.model.CurrentAccount;
import com.devgen.banking.service.AccountService;
import com.devgen.banking.service.TransactionService;

public class BankingCustomerClient {

    //Console Based Client(No frontend involved)

    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        //Store Data
        long accountNumber = accountService.createAccount(3000, AccountType.SAVING);
        Account account = accountService.getAccount(accountNumber);

        //Print Data
        System.out.println("Account Number : " + account.getAccountNumber() + " " + "" +
                "Balance : " + account.getBalance()+" Account type : "+account.getAccountType());

        //Deposit
        TransactionService transactionService = new TransactionService(accountService);
        transactionService.deposit(accountNumber,500);

        //Print Updated Balance
        account = accountService.getAccount(accountNumber);

        System.out.println("Account Number : " + account.getAccountNumber() + " " + "" +
                "Balance : " + account.getBalance()+" Account type : "+account.getAccountType());

        //Withdrawal
        transactionService = new TransactionService(accountService);
        transactionService.withdraw(accountNumber,200);

        //Print Updated Balance
        account = accountService.getAccount(accountNumber);

        System.out.println("Account Number : " + account.getAccountNumber() + " " + "" +
                "Balance : " + account.getBalance()+" Account type : "+account.getAccountType());




    }
}
