package chapterFive;

public class DiamondPrintingPattern {

    public static void main(String[] args) {
        int spaces = 9;
        int star = 1;
        int lines = 9;
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
