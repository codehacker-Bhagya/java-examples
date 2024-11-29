package com.bhagya.operators.lessthan;

import java.util.Scanner;

public class DeadlineCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentDate = scanner.nextInt();
        int DeadlineDate = 15;

        if(currentDate < DeadlineDate ){
            System.out.println("logged in");
        }else {
            System.out.println("Deadline is already passed");
        }


    }
}
