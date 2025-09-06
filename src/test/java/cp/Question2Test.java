package cp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    @Test
    void testIsPalindrome() {
        assertTrue(Solution2.isPalindrome("aba"));
        assertTrue(Solution2.isPalindrome("a"));
        assertTrue(Solution2.isPalindrome(""));
        assertFalse(Solution2.isPalindrome("abc"));
        assertFalse(Solution2.isPalindrome("ab"));
    }
}
