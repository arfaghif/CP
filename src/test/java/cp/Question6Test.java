

package cp;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

class Question6Test {
    @Test
    void testProcessQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        int[] result = Solution6.processQueue(queue);
        assertArrayEquals(new int[]{1,2,3}, result);
    }
}
