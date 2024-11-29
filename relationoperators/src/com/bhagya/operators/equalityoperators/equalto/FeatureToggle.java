package com.bhagya.operators.equalityoperators.equalto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FeatureToggle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Setting = 5;

        System.out.println("Do You Want Wifi on");
        int Wifi = scanner.nextInt();

        if(Setting == Wifi ){
            System.out.println("Setting Matched pls Enable the Wifi");
        }else{
            System.out.println("Something Went Wrong");
        }


    }
}
