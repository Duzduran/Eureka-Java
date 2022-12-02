import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LC0587Test {
    private LC0587_ErectTheFence solution = new LC0587_ErectTheFence();

    @Test
    void ErectTheFence(){
        int[][] nums = {{1,2},{2,2},{4,2}};
        int[][] res = solution.outerTrees(nums);
        assertArrayEquals(res, new int[][]{{4,2},{2,2},{1,2}});

        int[][] nums2 = {{1,1},{2,2},{2,0},{2,4}, {3,3},{4,2}};
        int[][] res2 = solution.outerTrees(nums2);
        assertArrayEquals(res2, new int[][] {{2,0},{4,2},{3,3},{2,4},{1,1}});
    }
}
