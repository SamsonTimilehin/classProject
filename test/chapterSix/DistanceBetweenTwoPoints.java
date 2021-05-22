package chapterSix;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c1;
        double c2;
        double c3;
        double c4;

        System.out.println("Enter first coordinate");
        c1 = input.nextDouble();

        System.out.println("Enter second coordinate");
        c2 = input.nextDouble();

        System.out.println("Enter third coordinate");
        c3 = input.nextDouble();

        System.out.println("Enter fourth coordinate");
        c4 = input.nextDouble();

        System.out.println("The distance is " + findDistance(c1,c2,c3,c4));



    }
    public static double findDistance(double x1,double x2, double y1, double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
}
