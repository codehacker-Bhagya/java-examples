package com.bhagya.inherritance.practice.repository;

import com.bhagya.inherritance.practice.model.SavingAccount;

public class SavingAccountRepository extends AccountRepository {

    final double DEFAULT_INTEREST_RATE = 4.5;

    public double calculateInterest(SavingAccount account){
        return account.getBalance() + (DEFAULT_INTEREST_RATE/100);
    }


}
