package com.bhagya.operators.equalityoperators.equalto;

import java.util.Scanner;

public class GameScoring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        String GameName;
        int playerScore;
        int winningTarget = 20;

        System.out.println("Enter you Game Score");
        int PlayerScore = scanner.nextInt();

        if(PlayerScore == winningTarget){
            System.out.println("You Are Win");
        }else{
            System.out.println("Your Score is less than winning target");
        }


    }
}
