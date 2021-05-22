package chapterSix;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        int firstNum,secondNum,result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        firstNum = input.nextInt();

        System.out.println("Enter Second Number");
        secondNum = input.nextInt();


        result = greatestCommonDivisor(firstNum,secondNum);
        System.out.println(result);

    }
    public static int greatestCommonDivisor(int firstNumber, int secondNumber){
        while (secondNumber != 0){
            if(firstNumber > secondNumber){
                firstNumber -= secondNumber;
            }else secondNumber -= firstNumber;
        }
        return firstNumber;
    }
}
