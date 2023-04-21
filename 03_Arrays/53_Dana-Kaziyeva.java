class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, cur = 0;
        for (int i = 0; i < n; i++) {
            cur += nums[i]; 
            max = Math.max(max, cur);
            cur = Math.max(cur, 0);
        } 
        return max;
    }
}
