public class CounterQuestions {
    public static void main(String[] args) {
        int counter = 1;
        counter = ++counter + ++counter;
        System.out.println(counter);

        int counter2 = 1;
        counter2 = counter2++ + ++counter2;
        System.out.println(counter2);

        int counter3 = 1;
        counter3 = counter3++ + counter3++;
        System.out.println(counter3);

        int counter4 = 1;
        counter4 = ++counter4 + counter4++;
        System.out.println(counter4);
    }
}
