package Chapter_Foutheen;

public class CountWords {

    public static void main(String[] args) {


        System.out.println(countCharacter("we need what you think you need need need need need need need  need", "need"));
    }
    public static int countCharacter(String passStr, String word){
        String [] arrayObj = passStr.split(" ");
        int counter = 0;
        for (String element : arrayObj) {
            if (word.equals(element)) {
                counter++;
            }
        }
        return counter;

    }
}
