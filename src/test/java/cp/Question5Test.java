package cp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Question5Test {
    @Test
    void testEvaluatePostfix() {
        assertEquals(17, Solution5.evaluatePostfix("23*54*+9-"));
        assertEquals(15, Solution5.evaluatePostfix("34+2*1+"));
        assertEquals(12, Solution5.evaluatePostfix("93+"));
    }
}
