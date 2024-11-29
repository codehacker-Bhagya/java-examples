package com.bhagya.operators.lessthan;

import java.util.Scanner;

public class StockMonitoring {

    public static void main(String[] args) {

        System.out.println(" Item Name = Fun Book");
        System.out.println(" Minimum Stock Quantity = 10");
        System.out.println(" Books Available in Store");

        Scanner scanner = new Scanner(System.in);
        int books = scanner.nextInt();
        if(books < 10){
            System.out.println("Pls Restock the books");
        }else {
            System.out.println(" stock Available ");
        }


    }

}
