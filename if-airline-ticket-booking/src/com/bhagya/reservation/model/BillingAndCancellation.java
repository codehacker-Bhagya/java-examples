package com.bhagya.reservation.model;

public class BillingAndCancellation {

    private String PaymentMethod;
    private int Upiid;
    private int password;

    @Override
    public String toString() {
        return "BillingAndCancellation{" +
                "PaymentMethod='" + PaymentMethod + '\'' +
                ", Upiid=" + Upiid +
                ", password=" + password +
                '}';
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public int getUpiid() {
        return Upiid;
    }

    public void setUpiid(int upiid) {
        Upiid = upiid;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
