package chapterFour;

import org.w3c.dom.ls.LSOutput;

import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class PlayGround2Test {

    public static void main(String[] args) {
//    String [] testArray = {"the3","read1","goes5","you2","and4"};
//        System.out.println(Arrays.toString(displaySortedString(testArray)));
//
//    }
//    public static String[] displaySortedString(String[] stringArray){
//        int store1 = 0;
//        int store2 = 0;
//
//        for(int i = 0; i < stringArray.length; i++){
//            String stringElement1 = stringArray[i];
//            for(int j = 0; j < stringElement1.length(); j++){
//               if(Character.isDigit(stringElement1.charAt(j))){
//                   store1 = Integer.parseInt(stringElement1.charAt(j) + "");
//               }
//            }
//
//            for(int k = i + 1; k < stringArray.length; k++){
//                String stringElement2 = stringArray[k];
//                for(int m = 0; m < stringElement2.length(); m++){
//                    if(Character.isDigit(stringElement2.charAt(m))){
//                        store2 = Integer.parseInt(stringElement2.charAt(m) + "");
//                    }
//                }
//                if(store1 > store2){
//                    String temp = stringArray[i];
//                    stringArray[i] = stringArray[k];
//                    stringArray[k] = temp;
//                }
//            }
//        }
//        return stringArray;


//String john = "2316789";
//for(int k = 0; k < john.length(); k++){
//    if(john.charAt(k) == 3){
//        System.out.println(Character.valueOf(john.charAt(k)));
//    }
//}

//        int [] test = {3,5,2,4,1};
//        IntPredicate even = value -> value % 2 == 0;
//        IntPredicate greater = val -> val > 1;
//        IntStream.of(test).filter(even.negate()).forEach(System.out::println);

//        BigInteger store = BigInteger.valueOf(5400);
//        BigInteger red = BigInteger.valueOf(500000000);
//        System.out.println(store.multiply(red));

      int [] value = {1,2,3,6,7,9};

        System.out.println(IntStream.of(value).reduce(2, (x,y) -> x * y));

    }
}
