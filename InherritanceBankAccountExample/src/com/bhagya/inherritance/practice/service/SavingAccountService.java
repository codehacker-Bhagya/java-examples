package com.bhagya.inherritance.practice.service;

import com.bhagya.inherritance.practice.model.SavingAccount;
import com.bhagya.inherritance.practice.repository.SavingAccountRepository;

public class SavingAccountService extends AccountService {

    SavingAccountRepository savingAccountRepository = new SavingAccountRepository();

    public double calculateInterest(SavingAccount account){
        return savingAccountRepository.calculateInterest(account);

    }
}
