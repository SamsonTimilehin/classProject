package Chapter_Five;

public class ModifiedTriangle {

    public static void main(String[] args) {

        int t1=1, t2 = 10;
        int space1 = 12, space2 = 5;
        for(int i = 0; i < 10; i++){
            for(int a = t1; a>0; a--){
                System.out.print("*");
            }
            for(int b = space1; b>0; b--){
                System.out.print(" ");
            }
            for(int c = t2; c>0; c--){
                System.out.print("*");
            }
            for(int b = space2; b>0; b--){
                System.out.print(" ");
            }
            for(int a = t2; a>0; a--){
                System.out.print("*");
            }
            for(int b = space1; b>0; b--){
                System.out.print(" ");
            }
            for(int a = t1; a>0; a--){
                System.out.print("*");
            }
            System.out.println();
            t1++; space1--; t2--; space2 +=2;
        }

    }
}
