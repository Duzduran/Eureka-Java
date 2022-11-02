import java.util.HashMap;
import java.util.Map;

public class LC0001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sum = new HashMap<>();

        for(int i =0;i<nums.length; i++){
            int c = target - nums[i];
            if(sum.containsKey(c))
                return new int [] {sum.get(c),i};
            sum.put(nums[i],i);

        }
        return null;
    }
}
