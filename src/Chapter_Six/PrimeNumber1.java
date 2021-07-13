package Chapter_Six;

public class PrimeNumber1 {

    public static void main(String[] args) {


        for(int number = 1; number <= 30; number++){
            boolean isPrime = true;
            for(int divisor = 2; divisor < number; divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number);
            }
        }
    }
}
