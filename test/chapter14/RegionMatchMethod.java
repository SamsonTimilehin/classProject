package chapter14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;





public class RegionMatchMethod {
    @Test
    void checkUserInput(){
    Assertions.assertTrue(compareInputs("hello","hello"));
    Assertions.assertTrue(compareInputs("hello","HELLO"));
    Assertions.assertTrue(compareInputs("HELLO","hello"));
    }
    boolean compareInputs(String input1, String input2){

        return input1.toLowerCase().regionMatches(2,input2.toLowerCase(),2, 3);

    }

}
