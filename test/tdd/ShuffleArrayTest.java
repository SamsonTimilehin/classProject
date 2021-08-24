package tdd;

import Chapter_Seven.ShuffleArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShuffleArrayTest {

    @Test
    void arrayObjectCanBeCredited(){
        ShuffleArray shuffleArray = new ShuffleArray();
        shuffleArray.displayArray(new int[]{1,2,3,4,5});
    }
    @Test
    void shuffledArrayIsTested(){
        ShuffleArray shuffleArray = new ShuffleArray();
        shuffleArray.displayArray(new int[]{1,2,3,4,5});
        assertNotEquals((new int[]{1,2,3,4,5}), shuffleArray.getDisplayArray());


    }
}
