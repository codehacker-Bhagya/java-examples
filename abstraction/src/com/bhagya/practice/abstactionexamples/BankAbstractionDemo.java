package com.bhagya.practice.abstactionexamples;

import com.bhagya.practice.bankexample.SBIBankService;

public class BankAbstractionDemo {

    public static void main(String[] args) {

        SBIBankService sbiBankService = new SBIBankService();
        sbiBankService.openAccount();
        sbiBankService.disburseLoan();
    }
}
