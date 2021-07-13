package Chapter_Six;

import java.util.Scanner;

public class StudentPoint {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score;
        System.out.println("Enter Student Score");
        score = input.nextInt();

        while(score > 100){
            System.out.println("Invalid Input");
            score = input.nextInt();
        }
        System.out.println(qualityPoint(score));


    }
    public  static String qualityPoint(int studentScore){
        String point;
        if(studentScore >=90 && studentScore <=100){
            point = "4";
        }else if(studentScore >=80 && studentScore <=89){
            point = "3";
        }else if(studentScore >=70 && studentScore <=79){
            point = "2";
        }else if(studentScore >=60 && studentScore <=69){
            point = "1";
        }else point = "0";
        return point;
    }
}
