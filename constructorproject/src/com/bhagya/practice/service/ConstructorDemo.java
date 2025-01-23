package com.bhagya.practice.service;

import com.bhagya.practice.model.Train;

public class ConstructorDemo {

    public static void main(String[] args) {

        Train train1 = new Train(1,"Shatabdi","Pune-Mumbai");

        Train train2 = new Train(2, "VandeBharat", "Mumbai" );

        System.out.println("Train1" + train1);
        System.out.println("Train2" + train2);
    }
}
