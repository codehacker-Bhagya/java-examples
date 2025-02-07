package com.bhagya.inherritance.practice.service;

import com.bhagya.inherritance.practice.model.Account;
import com.bhagya.inherritance.practice.repository.AccountRepository;

import java.util.Scanner;
import java.util.Set;

public class AccountService {

    Scanner scanner = new Scanner(System.in);

    private final AccountRepository accountRepository = new AccountRepository();
    public Account openAccount(){
        Account account = new Account();

        System.out.println("Enter your account No");
        int accountNo = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter your First name");
        String firstName = scanner.nextLine();

        System.out.println("Enter your Last Name");
        String LastName = scanner.nextLine();

        account.setAccountNo(12354);
        account.setFirstName("Bhagyashala");
        account.setLastName("Patre");
        return accountRepository.openAccount(account);

    }

    public Account viewAccount(int accountNumber){
        return accountRepository.getAccount(accountNumber);
    }

    public Set<Account> getAllAccounts(){
        return accountRepository.getAllAccounts();
    }

}
