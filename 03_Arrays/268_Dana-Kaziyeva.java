class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1])return nums[i]+1;
        }if(nums[0]==0)
          return nums.length;
        else return 0;
    }
}