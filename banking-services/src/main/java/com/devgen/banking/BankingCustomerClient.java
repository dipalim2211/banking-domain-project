package com.devgen.banking;

import com.devgen.banking.model.Account;
import com.devgen.banking.model.AccountType;
import com.devgen.banking.model.CurrentAccount;
import com.devgen.banking.model.SavingAccount;

public class BankingCustomerClient {

    /* Account Abstract Class
    Account account = new Account(12345,1000, AccountType.CURRENT);

    SavingAccount s1 = new SavingAccount(13456,2000);
        //No need to give type

    CurrentAccount c1 = new CurrentAccount(2345,3000);
     */

    Account s1 = new SavingAccount(13456,2000);
    Account c1 = new CurrentAccount(2345,3000);


}
