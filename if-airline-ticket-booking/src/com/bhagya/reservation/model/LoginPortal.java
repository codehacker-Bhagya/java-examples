package com.bhagya.reservation.model;

public class LoginPortal {

    private String UserName;
    private int Password;

    @Override
    public String toString() {
        return "LoginPortal{" +
                "UserName='" + UserName + '\'' +
                ", Password=" + Password +
                '}';
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }
}
