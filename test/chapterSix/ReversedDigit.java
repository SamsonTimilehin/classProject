package chapterSix;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class ReversedDigit {

    @Test
    void testReversedNumber(){
        assertEquals(4321,reverseNumber(1234));
        assertEquals(1987,reverseNumber(7891));
        assertEquals(1367,reverseNumber(7631));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number To Be Reversed:");
        int userInput = input.nextInt();

        System.out.println("The reverse is: " + reverseNumber(userInput));

    }
    public static int reverseNumber(int number){
        int remainder, reverse = 0;
        while (number > 0) {
            remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse;
    }
}
