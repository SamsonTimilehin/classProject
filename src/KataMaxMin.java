import java.util.Scanner;

public class KataMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNumber = Integer.MIN_VALUE;
        int maxNumber = Integer.MAX_VALUE;


         maxNumber = 0;
         minNumber = 0;
        int inputNumbers;


        for (int  totalInputNumbers = 0;totalInputNumbers < 5;totalInputNumbers++) {
            System.out.print("Enter Numbers: ");
            inputNumbers = input.nextInt();

            if (inputNumbers > maxNumber) {
                maxNumber = inputNumbers;
            }
            if(totalInputNumbers ==0 && inputNumbers > 0){
                minNumber = inputNumbers;
            }

            if (inputNumbers < minNumber){
                minNumber = inputNumbers;


            }
        }
        System.out.printf("The maximum number is %s%n ", maxNumber);
        System.out.printf("The minimum number is %s", minNumber);

    }
}

