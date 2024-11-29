package com.bhagya.operators.greaterthanequalto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FitnessTracking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userid;
        float height;
        float Weight;
       long FirstStepGoal = 1000;

        System.out.println("Counting Steps");

        System.out.println("Enter Your Todays Steps");
        long Steps = scanner.nextLong();

        long RequiredSteps = FirstStepGoal -Steps;

        if (Steps >= FirstStepGoal){
            System.out.println(" Congratulations !!! You Reach First Goal ");
        } else{
            System.out.println("Required Steps For First Goal " + RequiredSteps);
        }


    }
}


