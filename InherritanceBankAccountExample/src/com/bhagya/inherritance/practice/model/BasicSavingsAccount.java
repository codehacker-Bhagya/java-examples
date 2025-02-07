package com.bhagya.inherritance.practice.model;

public class BasicSavingsAccount extends SavingAccount {

    boolean isZeroBalanceAccount;
    int withdrawLimit;

    @Override
    public String toString() {
        return "BasicSavingsAccount{" +
                "interestRate=" + interestRate +
                ", withdrawLimit=" + withdrawLimit +
                ", isZeroBalanceAccount=" + isZeroBalanceAccount +
                ", balance=" + balance +
                ", firstName='" + firstName + '\'' +
                ", accountNo=" + accountNo +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    public boolean isZeroBalanceAccount() {
        return isZeroBalanceAccount;
    }

    public void setZeroBalanceAccount(boolean zeroBalanceAccount) {
        isZeroBalanceAccount = zeroBalanceAccount;
    }

    public int getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(int withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
