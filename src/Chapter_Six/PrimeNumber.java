package Chapter_Six;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(isPrimeNumber(10000));


    }
    public static String isPrimeNumber(int number){
        String primeNumber=" ";
        for(int i = 1; i<=number; i++){
            int counter=0;
            for(int num =i; num>=1; num--){
                if(i%num==0){
                    counter++;
                }
            }
            if(counter ==2){
              primeNumber = primeNumber + i + " ";
            }
        }
        return primeNumber;
    }
}
