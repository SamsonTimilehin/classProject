package chapterSix;

import java.util.Scanner;

public class FindMinimumValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        double num1 = input.nextDouble();
        System.out.println("Enter Second Number");
        double num2 = input.nextDouble();
        System.out.println("Enter Third Number");
        double num3 = input.nextDouble();

        System.out.println(findMinimumNumber(num1,num2,num3));


    }
    public static double findMinimumNumber(double number1, double number2, double number3){
        return Math.min((number1),Math.min(number2,number3));
    }

}
