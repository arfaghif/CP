package cp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("aba"));
        assertTrue(StringUtils.isPalindrome("a"));
        assertTrue(StringUtils.isPalindrome(""));
        assertFalse(StringUtils.isPalindrome("abc"));
        assertFalse(StringUtils.isPalindrome("ab"));
    }
}
