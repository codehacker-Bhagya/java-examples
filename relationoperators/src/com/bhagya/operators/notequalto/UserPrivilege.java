package com.bhagya.operators.notequalto;

import java.util.Scanner;

public class UserPrivilege {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int username = 2530;

        System.out.println("Pls Enter your username");
        int Username = scanner.nextInt();

        if(username != Username){
            System.out.println("You Can not access this folder");
        }else{
            System.out.println("Matched");
        }

    }

}
