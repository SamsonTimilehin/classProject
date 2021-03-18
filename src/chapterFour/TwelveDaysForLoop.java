package chapterFour;

public class TwelveDaysForLoop {
    public static void main(String[] args) {


        for (int counter = 1; counter <= 12; counter ++ ){
            System.out.print("On the ");

            switch (counter){
                case 12 -> display("twelve");
                case 11 -> display("eleven");
                case 10 -> display("ten");
                case 9 -> display("nine");
                case 8 -> display("eight");
                case 7 -> display("seventh");
                case 6 -> display("sixth");
                case 5 -> display("fifth");
                case 4 -> display("fourth");
                case 3 -> display("third");
                case 2 -> display("second");
                case 1 -> display("first");

            }
            System.out.println(" Day of Christmas my true love gave to me");

            switch(counter){
                case 12:
                    display("twelve Drummers Drummer");
                case 11:
                    display("eleven Piper piping");
                case 10:
                    display("the Lords a leaping");
                case 9:
                    display("nine ladies dancing");
                case 8:
                    display("eight maids a milking");
                case 7:
                    display("seven Swans a swimming");
                case 6:
                    display("six Geese a laying ");
                case 5:
                    display("five Golden Rings");
                case 4:
                    display("four Calling Birds");
                case 3:
                    display("three French Hens");
                case 2:
                    display("two Turtle Doves");
                case 1:
                    display("A partridge in a pear tree %n%n");
            }
        }
    }
    public static void display(String message){
        System.out.println(message);
    }
}



