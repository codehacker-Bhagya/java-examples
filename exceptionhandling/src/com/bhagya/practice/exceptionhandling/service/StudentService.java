package com.bhagya.practice.exceptionhandling.service;

import java.util.Scanner;

public class StudentService {

    Scanner scanner = new Scanner(System.in);
        public void addMarks() throws InvalidMarksException{
            System.out.println("pls enter marks ");
            int mathMarks = Integer.parseInt(scanner.nextLine());

    if(mathMarks > 100 || mathMarks < 0){
        throw new InvalidMarksException("Marks for Maths Are Invalid");
    }


}
}
