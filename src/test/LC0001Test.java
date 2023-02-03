import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LC0001Test {
    private LC0001_TwoSum solution = new LC0001_TwoSum();

    @Test
    void twoSum1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = solution.twoSum(nums, target);
        assertEquals(target, nums[res[0]] + nums[res[1]]);

    }

    @Test
    void twoSum2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] res = solution.twoSum(nums, target);
        assertEquals(target, nums[res[0]] + nums[res[1]]);
    }
}
