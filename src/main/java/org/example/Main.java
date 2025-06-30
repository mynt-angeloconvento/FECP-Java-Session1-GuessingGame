package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean isGuessed = false;
        int secretNumber = (int)(Math.random() * 5) + 1;
        System.out.println("I'm thinking of a number between 1 and 5.");
        for (int i = 1; i <= 3; i++){
            System.out.printf("Guess %d: ", i);
            int guess = myObj.nextInt();
            if (guess == secretNumber){
                System.out.println("You guessed it!");
                isGuessed = true;
                break;
            }
            else {
                if (i <= 2) System.out.println("Wrong guess.");
            }
        }
        if (isGuessed == true){
            System.out.println("You win!");
        } else {
            System.out.printf("You lose. The correct number was %d", secretNumber);
        }
    }
}