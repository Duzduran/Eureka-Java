import java.util.Arrays;

public class LC0198_HouseRobber {
    int[] arr;

    public int rob(int[] nums) {
        arr = new int[100];
        Arrays.fill(this.arr,-1);

        return robFrom(0,nums);

    }

    private int robFrom(int i, int[] nums){

        if(i >= nums.length) return 0;

        if(this.arr[i] > -1)
            return this.arr[i];

        int answer = Math.max(this.robFrom(i+1,nums),this.robFrom(i+2 , nums) + nums[i]);

        this.arr[i] = answer;
        return answer;
    }
}
