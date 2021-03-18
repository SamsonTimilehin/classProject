package chapterFour;

import java.util.Scanner;

public class Exercise {



    public static void main(String[] args) {
        int guessNumber;
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        guessNumber = input.nextInt();
        while(guessNumber != 50) {
            System.out.println("Not correct! please try again.");
            guessNumber = input.nextInt();
        } while(guessNumber == 50 ) {
                System.out.println("Correct! Congratulations.");
                guessNumber++;
            }

        }



}

