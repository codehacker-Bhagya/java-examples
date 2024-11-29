package com.bhagya.operators.lessthan;

import java.util.Scanner;

public class LessThanOperator {

      public static void main(String[] args) {

          //pseudo code
          //if value is less than 18 print minor and value is greater than 18 print adult

          Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age < 18){
            System.out.println("He/She is minor");
        }else {
            System.out.println("He/She is adult");

        }
    }
}
