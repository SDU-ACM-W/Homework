class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        retur nums[nums.length-k];
        
    }
}
