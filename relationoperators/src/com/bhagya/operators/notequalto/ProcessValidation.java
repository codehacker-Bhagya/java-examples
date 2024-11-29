package com.bhagya.operators.notequalto;

import java.util.Scanner;

public class ProcessValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defaultValue = 25;

        System.out.println("Enter Your Incremental Value");
        int i = scanner.nextInt();

        if(defaultValue != i){
            System.out.println("Skip this Process");
        }else{
            System.out.println("Processing");
        }





    }
}
