package com.bhagya.operators.greaterthanequalto;

import java.util.Scanner;

public class EligibilityCriteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TotalMarks = 200;
        int qualifyingMarks = 150;
        int obtainedMarks;

        System.out.println("Pls Enter your obtained Marks");
        int obtainMarks = scanner.nextInt();

        if(obtainMarks >= qualifyingMarks){
            System.out.println("You are qualified for Scholarship");
        }else{
            System.out.println(" you are not eligible");
        }
    }
}
