class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if(n == 3) return nums[0] * nums[1] * nums[2];
        int ans = 0;
        Arrays.sort(nums);
        if(nums[0] * nums[1] * nums[n - 1] > nums[n - 1] * nums[n - 2] * nums[n - 3]) ans = nums[0] * nums[1] * nums[n - 1];
        else ans = nums[n - 1] * nums[n - 2] * nums[n - 3];
         
        return ans;
    }
}
