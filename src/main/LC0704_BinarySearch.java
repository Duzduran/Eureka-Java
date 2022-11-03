public class LC0704_BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        return recursive(nums,low,high,target);
    }

    public int recursive(int[] nums, int low, int high, int target) {
        int mid = (low+high) / 2;
        if(low > high) return -1;

        if(nums[mid] == target) return mid;

        if(nums[mid] > target) return recursive(nums,low,mid-1,target);
        else return recursive(nums,mid+1,high,target);
    }
}
