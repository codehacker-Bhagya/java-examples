package com.bhagya.operators.greaterthan;

import java.util.Scanner;

public class ScoringSystem {

    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);

    int SurpassAvg = 90;
    int Studentavg;

        System.out.println("test1 score:");
        int test1 = scanner.nextInt();

        System.out.println("test2 score:");
        int test2 = scanner.nextInt();

        System.out.println("test3 score:");
        int test3 = scanner.nextInt();

        System.out.println("test4 score:");
        int test4 = scanner.nextInt();

       int  StudentAvg = ((test1 + test2 + test3 + test4)/4 );
        System.out.println("your avg Score is:" + StudentAvg);

       if(StudentAvg > SurpassAvg ){
           System.out.println("You got A Grade ");
       } else{
           System.out.println("You are Pass");
       }


    }
}
