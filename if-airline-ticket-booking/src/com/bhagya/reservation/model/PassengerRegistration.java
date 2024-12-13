package com.bhagya.reservation.model;

public class PassengerRegistration {

    private String fullName;
    private long MoNo;
    private long UIDno;
    private long passportNo;

    @Override
    public String toString() {
        return "PassengerRegistration{" +
                "fullName='" + fullName + '\'' +
                ", MoNo=" + MoNo +
                ", UIDno=" + UIDno +
                ", passportNo=" + passportNo +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getMoNo() {
        return MoNo;
    }

    public void setMoNo(long moNo) {
        MoNo = moNo;
    }

    public long getUIDno() {
        return UIDno;
    }

    public void setUIDno(long UIDno) {
        this.UIDno = UIDno;
    }

    public long getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(long passportNo) {
        this.passportNo = passportNo;
    }
}





