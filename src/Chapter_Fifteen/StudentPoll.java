package Chapter_Fifteen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class StudentPoll {

    public static void readSurveyInput(){

        try(Formatter formatter =
                    new Formatter( "src/Chapter_Fifteen/out/numbers.txt");
            Scanner input = new Scanner(System.in)
            ) {
            System.out.println("Enter survey "+ "responses and press ENTER+CTRL+D to quit");
            while(input.hasNext()){
                formatter.format("%d ", input.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static int[] processSurveyResponse() {
        int[] frequency = new int[6];
        try (Scanner input = new Scanner(Paths.get("src/Chapter_Fifteen/out/numbers.txt"));
             Formatter output = new Formatter("src/Chapter_Fifteen/out/output.txt")) {
            while (input.hasNextInt()) {
                int answer = input.nextInt();
                try {
                    ++frequency[answer];
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return frequency;
    }

    public static void writeSurveyFrequency(int[] frequency){
        try(Formatter output = new Formatter("src/Chapter_Fifteen/out/output.txt")) {
            output.format("%s%10s%n", "Rating", "Frequency");
            for (int i = 1; i < frequency.length; i++) {
                System.out.printf("%d%10d%n", i, frequency[i]);
                output.format("%d%10d%n", i, frequency[i]);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readSurveyInput();
        int[] frequency = processSurveyResponse();
        writeSurveyFrequency(frequency);
    }
}
