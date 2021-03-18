import java.util.Scanner;

public class KataMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter second Number: ");
        double secondNumber = input.nextDouble();
        System.out.print("Enter third Number: ");
        double thirdNumber = input.nextDouble();
        System.out.print("Enter fourth Number: ");
        double fourthNumber = input.nextDouble();
        System.out.print("Enter fifth Number: ");
        double fifthNumber = input.nextDouble();

        double maxNumber = 0;
        if (firstNumber > maxNumber) {
            maxNumber = firstNumber;
        }
        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }
        if (thirdNumber > maxNumber) {
            maxNumber = thirdNumber;
        }
        if (fourthNumber > maxNumber) {
            maxNumber = fourthNumber;
        }
        if (fifthNumber > maxNumber) {
            maxNumber = fifthNumber;
        }
        System.out.printf("The maximum number is %s", maxNumber);
    }
}
