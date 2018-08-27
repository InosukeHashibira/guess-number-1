package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int aNumber = (int )(Math.random() * 100 + 1);
        System.out.println("Try to guess the secret number!");
        //gets the random number



        while(true){

            int badGuess = 0;
            Scanner keyboard = new Scanner(System.in);
            badGuess = keyboard.nextInt();
            //user inputs guess


            if (badGuess == aNumber) {
                System.out.println("You guessed the number!");
                System.exit(0);
            }
            else if (badGuess > aNumber) {
                System.out.println("The secret number is lower than your guess!");
            }
            else {
                System.out.println("The secret number is higher than your guess!");
            }
        }
    }
}