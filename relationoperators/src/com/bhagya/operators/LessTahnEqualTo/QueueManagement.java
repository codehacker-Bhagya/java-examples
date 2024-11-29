package com.bhagya.operators.LessTahnEqualTo;

import java.util.Scanner;

public class QueueManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queueMaxsize = 10;
        int queueMinsize = 1;
        int topNo;

        int top = scanner.nextInt();
        if(  queueMinsize - 1 <= top  ){
            System.out.println(" Stack is empty");
        }else{
            System.out.println("Stack is full");
        }

    }
}
