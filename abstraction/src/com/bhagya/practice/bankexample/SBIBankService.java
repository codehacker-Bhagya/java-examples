package com.bhagya.practice.bankexample;

public class SBIBankService extends BankService {


    @Override
    public void disburseLoan() {
        System.out.println("loan is being disbursed");
    }

    public void openAccount(){
        System.out.println("Account opened by SBI bank");
    }
}
