package com.bhagya.practice.bankexample;

public abstract  class BankService {

    public abstract void disburseLoan();

    public void openAccount(){
        System.out.println("Account opened by generic bank");
    }

}
