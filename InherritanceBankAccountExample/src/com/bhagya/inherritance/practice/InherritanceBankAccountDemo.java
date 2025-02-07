package com.bhagya.inherritance.practice;

import com.bhagya.inherritance.practice.model.Account;
import com.bhagya.inherritance.practice.model.SavingAccount;
import com.bhagya.inherritance.practice.service.SavingAccountService;

public class InherritanceBankAccountDemo {

    public static void main(String[] args) {
        SavingAccountService savingAccountService = new SavingAccountService();
        Account account = savingAccountService.openAccount();

        System.out.println("Account opened" + account);
        System.out.println("All opened account in this bank:");

        savingAccountService.getAllAccounts().forEach(System.out::println);

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setAccountNo(account.getAccountNo());
        savingAccount.setFirstName(account.getFirstName());
        savingAccount.setLastName(account.getLastName());

        System.out.println("Interest: " + savingAccountService.calculateInterest(savingAccount));
    }
}
