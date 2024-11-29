package com.bhagya.operators.LessTahnEqualTo;

import java.util.Scanner;

public class LoanEliogibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String PersonName;
        String Proffesion;
        int ageofperson;

        System.out.println("Enter Your Name");
        String Name = scanner.nextLine();

        System.out.println("Enter your profession");
        String profession = scanner.nextLine();


        System.out.println("Enter Your Age");
        int age = scanner.nextInt();

        if(age <= 60){
            System.out.println("You Are  Elligible For Loan");
        }else{
            System.out.println("You Are Not Elligible");
        }


    }
}
