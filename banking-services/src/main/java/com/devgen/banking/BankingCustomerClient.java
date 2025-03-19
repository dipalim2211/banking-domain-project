package com.devgen.banking;

import com.devgen.banking.model.Account;
import com.devgen.banking.model.AccountType;
import com.devgen.banking.model.CurrentAccount;
import com.devgen.banking.model.SavingAccount;

public class BankingCustomerClient {


    public static void main(String[] args) {

    /* Account Abstract Class
    Account account = new Account(12345,1000, AccountType.CURRENT);

    SavingAccount s1 = new SavingAccount(13456,2000);
        //No need to give type

    CurrentAccount c1 = new CurrentAccount(2345,3000);
     */


        //Test UseCase 01:
        Account s1 = new SavingAccount(13456, 2000);

        System.out.println("Account Number : "+s1.getAccountNumber()+ " "+"" +
                "Balance : "+s1.getBalance());

        Account c1 = new CurrentAccount(23453, 3000);


        System.out.println("Account Number : "+c1.getAccountNumber()+ " "+"" +
                "Balance : "+c1.getBalance());




    }
}
