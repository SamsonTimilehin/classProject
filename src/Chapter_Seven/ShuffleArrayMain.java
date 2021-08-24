package Chapter_Seven;

import java.util.Arrays;

public class ShuffleArrayMain {
    public static void main(String[] args) {

        ShuffleArray shuffleArray = new ShuffleArray();
        shuffleArray.displayArray(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(shuffleArray.getDisplayArray()));
    }
}
