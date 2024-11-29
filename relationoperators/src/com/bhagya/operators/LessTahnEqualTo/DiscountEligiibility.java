package com.bhagya.operators.LessTahnEqualTo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DiscountEligiibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Customerid;
        double CustomerTotal;
        double DiscountRange = 5000;

        System.out.println("Your Customer id is: 301");
        System.out.println("Your Total is:");
        double Total = scanner.nextDouble();

        if( Total >= DiscountRange ){
            System.out.println("Its Amazing Your Total is More than our discount Range " + "so you get 20% off on your total");
        } else{
            System.out.println("Pls Pay the bill " + Total);
        }








        //System.out.println("Your Product Name");




    }
}
