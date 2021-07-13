package chapterFour;

public class Kata {


    public static double calculateAverage(int number1, int number2, int number3) {
        double result;
           result = (number1 + number2 + number3) / 3.0;
        return result;
    }

    public static String calculateGrade(int studentScore) {
        if (studentScore >= 90) {
            return "A";
        } else if (studentScore >= 80) {
            return "B";
        } else if (studentScore >= 70) {
            return "C";
        } else {
            return "F";
        }

    }

    public boolean isEven(int checkEven) {
        if (checkEven % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int numberToCheckForPrime) {
        int counter = 2;
        if (numberToCheckForPrime == 1) {
            return false;
        }
        while (counter++ < Math.sqrt(numberToCheckForPrime)) {
            if ((numberToCheckForPrime % counter == 0)) {
                return false;
            }
        }
        return true;
    }

    public double calculateTotalPrice(double number) {
        double amountPerCopy = 1500;
        double amountPerCopy1 = 1400;
        double counter = 1;
        while (number <= 4) {
            number *= amountPerCopy;
            // counter++;
            while (number <= 9) {
                number *= amountPerCopy1;
                counter++;
            }

        }
        return number;
    }

    public int calculatePriceFor(Kata testDriller) {
        return 0;
    }

    public static int displayFactorsOfNumbers(int number1) {
        for (int counter = 1; counter <= number1; counter++) {
            if (number1 % counter == 0) {
                System.out.print(counter + " ");
            }

        }
        return number1;
    }
}