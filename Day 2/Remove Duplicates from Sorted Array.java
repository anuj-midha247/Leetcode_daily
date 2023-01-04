class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        int le=0;
        for(int i=0;i<length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[le++]=nums[i];
            }
        }
        nums[le++]=nums[length-1];
        return le;
    }
}