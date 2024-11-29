package com.bhagya.operators.notequalto;

import java.util.Scanner;

public class DataSynchronization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueA;
        int valueB;
        int valueC;
        int valueD;



        System.out.println("Enter Dataset1 values");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int dataset1 = A+B;
        int dataset2 = C+D;

        if(dataset1 != dataset2){
            System.out.println("Mismatches the datasets");
        }else{
            System.out.println("matched");
        }
    }
}
