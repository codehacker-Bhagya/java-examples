package com.bhagya.operators.greaterthanequalto;

import java.util.Scanner;

public class StockReplinishment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FullStocklimit = 100;
        int stockAvailable;

        System.out.println("how many Stock Available ");
       int stockavailable = scanner.nextInt();



        if(  FullStocklimit >= stockavailable  ){
            System.out.println("Pls Restock the Product ");
        }else{
            System.out.println("Not Rrequire Restock");
        }

    }
}
