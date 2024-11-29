package com.bhagya.operators.greaterthanequalto;

import java.util.Scanner;

public class ExamCutoff {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int StudentId;
        String StudentName;
        int RollNo;
        int StudentScore;
        int CutoffScore = 95;

        System.out.println("Enter user id");
        int id = scanner.nextInt();

        System.out.println("Enter Student Name");
        String Name = scanner.nextLine();

        System.out.println("Enter Roll No");
        int Rollno = scanner.nextInt();

        System.out.println("Enter Student obtained Score");
        int obtainedScore = scanner.nextInt();


        if(obtainedScore >= CutoffScore ){
            System.out.println("You are Selected");
        }else{
            System.out.println("You mat not reach the Cutoff");
        }
    }
}
