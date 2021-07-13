package Chapter_Five;

public class CalculatePii {

    public static void main(String[] args) {

        System.out.println(displayPii(2000));

    }
    public static double displayPii(int numberOfTerms){
        int denominator = 1;
        double currentTerm;
        double pi = 0.0;
        for (int i = 0; i <= numberOfTerms; i++) {

            if (i % 2 == 0) {
                currentTerm = (double) 4 / denominator;
            } else {
                currentTerm = (double) -4 / denominator;
            }
            denominator = denominator + 2;
            pi = pi + currentTerm;

        }
        return pi;
    }
}