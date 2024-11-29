package com.bhagya.operators.LessTahnEqualTo;

import java.util.Scanner;

public class GradeAssign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        int passingScore = 40;

        System.out.println("Pls Enter Your Score");
        int Score = scanner.nextInt();


        if(passingScore <= Score  ){
            System.out.println("you are Pass");
        }else{
            System.out.println("pls try in next attempt");
        }

    }
}
