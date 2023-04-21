class Solution {
    public int[] productExceptSelf(int[] nums) {
        int cur=1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = cur;
            cur=cur*nums[i];
        }
        
        cur=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] =res[i]*cur;
            cur=cur*nums[i];
        }
        return res;
    }
}
// 1 1 2 6 
// 24 12 8 6
