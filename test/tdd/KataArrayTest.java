package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataArrayTest {

    @Test
    void sumArrayElement(){
        int [] array ={ 1,2,3,4,5};
        assertEquals(15, KataArray.sumArrayElement(array));

    }
    @Test
    void averageOfElement(){
        int [] array ={ 1,2,3,4,5};
        assertEquals(3, KataArray.averageOfElement(array));
    }

    @Test
    void getTheMinimumOfElements() {
        int [] array ={ 1,2,3,4,5};
        assertEquals(1, KataArray.getTheMinimumOfElements(array));
    }
    @Test
    void getTheMaximumElement(){
        int [] array ={ 1,2,3,4,5};
        assertEquals(5, KataArray.getTheMaximumElement(array));
    }

    @Test
    void getTheMaximumNumberOfAddedElements(){
        int [] array ={ 1,2,3,4,5};
        assertEquals(14, KataArray.getTheMaximumNumberOfAddedElements(array));
    }

    @Test
    void getTheMinimumNumberOfAddedElements() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(10, KataArray.getTheMinimumNumberOfAddedElements(array));
    }
}