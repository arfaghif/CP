package cp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Question3Test {
    @Test
    void testFindDuplicate() {
        assertEquals(Integer.valueOf(2), Solution3.findDuplicate(new int[]{1,2,3,4,2,5}));
        assertNull(Solution3.findDuplicate(new int[]{1,2,3,4,5}));
        assertEquals(Integer.valueOf(1), Solution3.findDuplicate(new int[]{1,1,1}));
    }
}
