package cp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {
    @Test
    void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Solution7.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);

        nums = new int[]{3, 2, 4};
        target = 6;
        result = Solution7.twoSum(nums, target);
        assertArrayEquals(new int[]{1, 2}, result);

        nums = new int[]{3, 3};
        target = 6;
        result = Solution7.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

}