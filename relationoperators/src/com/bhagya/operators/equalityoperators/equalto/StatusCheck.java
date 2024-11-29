package com.bhagya.operators.equalityoperators.equalto;

import java.util.Scanner;

public class StatusCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int Process = 100;
int progrss;

        System.out.println("Progress = ");
        int progress = scanner.nextInt();

        if(Process == progress ){
            System.out.println("System is Ready");
        }else{
            System.out.println("Work in progress");
        }



    }
}
