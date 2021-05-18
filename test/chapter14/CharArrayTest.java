package chapter14;

import org.junit.jupiter.api.Test;

public class CharArrayTest {
    @Test
    void reverseString(){
        String initial =  "68573565 234";

        StringBuilder reserved = new StringBuilder(initial.substring(initial.length()-3));
        reserved.append(") ");
        reserved.insert(0,"(+");
        int count = 0;
        for(int i = initial.length()-5; i>=0; i--) {
            if (count % 3 == 0 && count > 0) {
                count = 0;
                reserved.append("-");
            }
            reserved.append(initial.charAt(i));
            count++;

        }
        System.out.println(reserved);
    }
}
