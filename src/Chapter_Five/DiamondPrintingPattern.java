package Chapter_Five;

public class DiamondPrintingPattern {

    public static void main(String[] args) {
        int spaces = 9;
        int star = 1;
        int line = 9;
        int div = line/2+1;
        for (int i = 1; i <= line; i++) {
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
