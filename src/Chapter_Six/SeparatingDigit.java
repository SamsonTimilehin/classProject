package Chapter_Six;

import java.util.Scanner;

public class SeparatingDigit {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter Digit between 1 - 99999");
        int enteredInputs = input.nextInt();
        if(enteredInputs >= 1 && enteredInputs <= 99999) {
            System.out.println(displayDigit(enteredInputs));
        }else System.out.println("Invalid Number");
        }

    public static int partOfQuotient(int a, int b){
        return  a/b;
    }
    public static int getRemainder(int a, int b){
        return a%b;
    }
    public static String displayDigit(int n){
        int unit;
    String result  = " ";
    while(n > 0){
       unit = getRemainder(n,10);
       result = unit + "  " + result;
       n = partOfQuotient(n,10);
    }
        return result;
    }
}
