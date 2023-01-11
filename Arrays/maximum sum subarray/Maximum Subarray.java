class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum=0,max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           curr_sum=Math.max(curr_sum+nums[i],nums[i]);
           max_sum=Math.max(max_sum,curr_sum);
        }
        return max_sum;
    }
}