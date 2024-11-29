package com.bhagya.operators.lessthan;

import java.util.Scanner;

public class GradingOfMarks {

    public static void main(String[] args) {

       // pseduo code
        //

        System.out.println("Marks You Got");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if(marks < 35){
            System.out.println("C Grade");
        } else if ( marks >= 35 && marks < 60 ){
            System.out.println("B Grade");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("B+ Grade");
        }else if (marks >= 75 && marks <90){
            System.out.println("A Grade");
        }else if(marks >=90 && marks <= 100){
            System.out.println("A+ Grade");
        }else{
            System.out.println("Invalid No");
        }


    }
}
