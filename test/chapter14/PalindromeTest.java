package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @Test
    void checkUserInputTest() {
        assertTrue(isPalindrome("madam"));
        assertTrue(isPalindrome("mallam"));
        assertFalse(isPalindrome("mall"));
    }
    boolean isPalindrome(String word) {
        StringBuilder reverse = new StringBuilder();
        for(int i = word.length()-1; i >=0; i--){
            reverse.append(word.charAt(i));
        }
        return reverse.toString().equalsIgnoreCase(word);
    }
}
