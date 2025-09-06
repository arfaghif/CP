package cp;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

class Question4Test {
    @Test
    void testCountFrequency() {
        int[] arr = {1,2,2,3,3,3};
        HashMap<Integer, Integer> freq = Solution4.countFrequency(arr);
        assertEquals(1, freq.get(1));
        assertEquals(2, freq.get(2));
        assertEquals(3, freq.get(3));
        assertNull(freq.get(4));
    }
}
