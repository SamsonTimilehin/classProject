package chapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class PlayGround2Test {

    public static void main(String[] args) {
        // String astherics = " ";
        // for ( int i =0 ; i <= 10 ; i++){
        //   System.out.println(astherics);
        //  astherics += "*";
       // System.out.println("Maximum number is " + PlayGround2.maxClass(45, 43, 78));
      //  PlayGround2 g = new PlayGround2();
       // Scanner scan = new Scanner(System.in);
      //  System.out.println("Enter three numbers");
       // double num1 = scan.nextDouble();
       // double num2 = scan.nextDouble();
        //double num3 = scan.nextDouble();
        //double result = Math.max (num1,Math.max(num2,num3));
        //System.out.println("max is " + result);

        //int [] c = new int[12];
       // System.out.println(c);
      //  System.out.println(g);

       // int [] scores = new int[5];
       // scores[0] = 57;
      //  scores[1] = 78;
      //  scores[2] = 45;
      //  scores[3] = 60;
      //  scores[4] = 100;

      //  for(int counter = 0 ; counter < 5 ; counter ++)
      //  System.out.println(scores[counter]);

       // System.out.println("Enter array elements");
       // Scanner input = new Scanner(System.in);
        //int arrayNumber = input.nextInt();


        //int [] arraySize = new int[arrayNumber];

       // System.out.println("Enter one by one");
        //int sum = 0;
        //for (int counter = 0 ; counter < arrayNumber; counter++){
         // arraySize[counter] = input.nextInt();
          // sum += arraySize[counter];

       // }
        //System.out.println("Elements of array are " + Arrays.toString(arraySize));
        //System.out.println("Sum is " + sum);
    //int [] array = {1,2,3,4,5};
      //  int sum = 0;
      //  for(int counter = 0 ; counter < 4 ; counter ++) {
       //     sum += array[counter];
       // }
      //  System.out.println(sum);

        int [] grades = {2,4,2,5,6,3,4};
        int sum = 0;
        int counter = 0;
        for(int gradeName: grades){
            counter ++;
            if(counter % 2 == 0) continue;
            sum+=gradeName;
        }
        System.out.println(sum);
    }


    }

