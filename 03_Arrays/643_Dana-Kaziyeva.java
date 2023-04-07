class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1)return nums[0];
        int res=0;
        for(int j=0;j<k;j++){
                res+=nums[j];
            }
        int cur=res;
        for(int i=k; i<nums.length;i++){
            cur= cur-nums[i-k] + nums[i];
            if (res < cur)res=cur;
            //  System.out.println(" " + cur + " "  + (double)cur/k + " "+ res);
            
        }
        return res/(k*1.0d);        
    }
}
