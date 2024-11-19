package com.bhagyas.practice.model;

public class Address {
    public String state;
    public String city;
    public String buildingName;
    public String district;
    public int pin;

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", district='" + district + '\'' +
                ", pin=" + pin +
                '}';
    }
}
