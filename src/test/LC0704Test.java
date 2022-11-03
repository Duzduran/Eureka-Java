import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
public class LC0704Test {

    private LC0704_BinarySearch solution = new LC0704_BinarySearch();

    @Test
    void binarySearch(){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int res = solution.search(nums,target);
        assertEquals(4,res);
    }

    @Test
    void binarySearch2(){
        assertThat(solution.search(new int[] {-1, 0, 3, 5, 9, 12}, 2), equalTo(-1));
    }
}
