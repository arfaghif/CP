package cp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Question1Test {
    @Test
    void testFindMax() {
        assertEquals(5, ArrayUtils.findMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(10, ArrayUtils.findMax(new int[]{10, 2, 3, 4, 5}));
        assertEquals(-1, ArrayUtils.findMax(new int[]{-1, -2, -3}));
    }
}
