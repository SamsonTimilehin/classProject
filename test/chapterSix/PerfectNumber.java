package chapterSix;

public class PerfectNumber {

    public static void main(String[] args) {

        for (int num = 2; num < 10000; num++)
            if (isPerfect(num))
                System.out.println(num);






    }
    public static boolean isPerfect(int number){

        int sum = 1;
        for(int counter = 2; counter * counter < number; counter++){
            if(number % counter == 0){
                if(counter * counter != number) {
                    sum += counter + number / counter;
                }else sum +=counter;
            }

        }
        return sum == number && number != 1;

    }
}
