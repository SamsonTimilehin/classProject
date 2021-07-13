package Chapter_Five;

import java.util.Scanner;

public class DiamondPrintWithScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter Number of Rows");

        int lines = input.nextInt();
        if(lines % 2 == 0){
            System.out.println("Try Again");
            lines = input.nextInt();
        }
        int spaces = 19;
        int star = 1;
        int div = lines/2+1;

        for (int i = 1; i <= lines; i++) {

            for (int s = spaces; s > 0; s--) {
                System.out.print(" ");
            }
            for (int a = star; a > 0; a--) {

                System.out.print("* ");
            }
            System.out.println();

            if(i < div) {
                spaces -= 2;
                star += 2;
            }   else {
                spaces+=2; star-=2;
            }

    }
}

}
