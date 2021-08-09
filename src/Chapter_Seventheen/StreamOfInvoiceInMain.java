package Chapter_Seventheen;


import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamOfInvoiceInMain {

    public static void main(String[] args) {

        List<StreamOfInvoice> listOfInvoice = List.of(
                new StreamOfInvoice(83, "Electric sander ", 7, 57.98),
                new StreamOfInvoice(24, "Power saw       ", 18, 99.99),
                new StreamOfInvoice(7, "Sledge hammer    ", 11, 21.50),
                new StreamOfInvoice(77, "Hammer          ", 76, 11.99),
                new StreamOfInvoice(39,"Lawn mower       ", 3, 79.50),
                new StreamOfInvoice(68,"Screwdriver      ", 106, 6.99),
                new StreamOfInvoice(56, "Jig saw         ", 21, 11.00),
                new StreamOfInvoice(3, "Wrench           ", 34, 7.50)

        );
        System.out.println("-----------------------------Display Objects---------------------------------------");
        listOfInvoice.forEach(System.out::println);

        System.out.println("-----------------------------Sort by part Description----------------------------");
        Function<StreamOfInvoice, String> byPartDescription = StreamOfInvoice::getPartDescription;
        Function<StreamOfInvoice, String> byPartNumber = StreamOfInvoice::getPartDescription;
        Comparator<StreamOfInvoice> partDescriptionThenPartNumber = (Comparator.comparing(byPartDescription)
                .thenComparing(byPartNumber));

        listOfInvoice.stream().sorted(partDescriptionThenPartNumber).forEach(System.out::println);

        System.out.println("-----------------------------Sort by price----------------------------");
        Function<StreamOfInvoice, Double> byPrice = StreamOfInvoice::getPrice;
        Function<StreamOfInvoice, Integer> byQuantity = StreamOfInvoice::getQuantity;
        Function<StreamOfInvoice, Double> byValue = StreamOfInvoice::getValue;

        Comparator<StreamOfInvoice> priceThenQuantity = (Comparator.comparing(byPrice)
                .thenComparing(byQuantity));

        listOfInvoice.stream().sorted(priceThenQuantity).forEach(System.out::println);

        System.out.println("-----------------------------Map and Sort by Quantity----------------------------");
        Comparator<StreamOfInvoice> quantityThenPartDescription = (Comparator.comparing(byQuantity)
                .thenComparing(byPartDescription));
        listOfInvoice.stream().sorted(quantityThenPartDescription)
                .map(StreamOfInvoice::getPartDescriptionAndQuantity).forEach(System.out::println);

        System.out.println("---------------Map partDescription and value(price * quantity)-------------------------");
        Comparator<StreamOfInvoice> partDescriptionThenValue = (Comparator.comparing(byValue))
                .thenComparing(byPartDescription);
        listOfInvoice.stream().sorted(partDescriptionThenValue)
                .map(StreamOfInvoice::getPartDescriptionAndValue).forEach(System.out::println);

        System.out.println("---------------Filter value between 200 to 500-----------------------------------------");
        Predicate<StreamOfInvoice> twoHundredToFiveHundred = val -> val.getValue() >= 200.00 && val.getValue() <= 500.00;

        listOfInvoice.stream().sorted(partDescriptionThenValue).
                filter(twoHundredToFiveHundred).map(StreamOfInvoice::getPartDescriptionAndValue)
                .forEach(System.out::println);
    }
}
