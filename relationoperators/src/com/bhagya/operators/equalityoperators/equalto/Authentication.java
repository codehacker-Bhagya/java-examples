package com.bhagya.operators.equalityoperators.equalto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Authentication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int UserName = 1234;

        System.out.println("Enter your User Name Below");
        int  username = scanner.nextInt();

        if(UserName == username ){
            System.out.println("User Name Matched Logged in");
        }else{
            System.out.println("Wrong USer Name");
        }


    }
}
