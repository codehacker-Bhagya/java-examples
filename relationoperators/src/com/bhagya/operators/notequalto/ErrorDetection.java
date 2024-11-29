package com.bhagya.operators.notequalto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ErrorDetection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String p = "PDF format";

        System.out.println("Upload Your File");
        String I = scanner.nextLine();


        if("String; I" != "String p"){
            System.out.println("File Format is not supported");
        }else{
            System.out.println("opened");
        }


    }
}
