import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LC0198Test {

    private LC0198_HouseRobber solution = new LC0198_HouseRobber();

    @Test
    void HouseRoober(){

        //Total amount you can rob = 1 + 3 = 4.
        int[] nums = {1,2,3,1};
        int res = solution.rob(nums);
        assertEquals(res, 4);


        //Total amount you can rob = 2 + 9 + 1 = 12.
        int[] nums2 = {2,7,9,3,1};
        int res2 = solution.rob(nums2);
        assertEquals(res2, 12);

    }
}
