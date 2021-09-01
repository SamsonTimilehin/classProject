package chapterFour;
import javax.swing.text.NumberFormatter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.time.*;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class PlayGround2Test {

    public static void main(String[] args) {


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

        // int [] value = {1,2,3,6,7,9};

        //System.out.println(IntStream.of(value).reduce(2, (x,y) -> x * y));

       // Date newDate = new Date();
      //boolean isCorrect =  newDate.after();
//        LocalDateTime period = LocalDateTime.now();
//        LocalDateTime period1 = LocalDateTime.of(2021,3,12,2,54);
//
//        if(period.getMonth().compareTo(Month.from(period1)) > 0){
//            System.out.println(period.getDayOfMonth());
//        }

//        System.out.println(displayDayOfTheACalendar(2021,8,20));
//
//    }
//    public static String displayDayOfTheACalendar(int year, int month, int day){
//
//        String[] days_of_the_week = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
//
//        Calendar cal = Calendar.getInstance();
//
//        cal.set(year, month-1, day);
//
//        int p = cal.get(Calendar.DAY_OF_WEEK);
//
//        return days_of_the_week[p -1];
//
//        LocalDateTime setD = LocalDateTime.of(2021,8,22,5,31);
//        LocalDateTime  test = LocalDateTime.now();
//        if(setD.getMonthValue() == test.getMonthValue()){
//            System.out.println("This month is her birth month");
//        }else System.out.println("This month is not her birth month");

//        Scanner scan = new Scanner(System.in);
//        double currencyValue = scan.nextDouble();
//        String nigeria = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("HA-LATN-NG")).format(currencyValue);
//        System.out.println(nigeria);

//      int good = Math.min(12,5);
//        System.out.println(good);


//        Map<String, Integer> mapNumber = new HashMap<>();
//        mapNumber.put("human", 4);
//        mapNumber.put("John", 8);
//        System.out.println(mapNumber);
//
//        Map<Long, String> mapLong = new HashMap<>();
//        mapLong.put(10231L,"Lion");
//        System.out.println(mapLong.get(10231L));
//        System.out.println(mapLong.isEmpty());

        PlayGround2 checkOut = new PlayGround2();
        List<String> mainList = new ArrayList<>();
        mainList.add("testing");

        checkOut.setNewList(mainList);

        System.out.println(checkOut.getNewList());

    }
}
