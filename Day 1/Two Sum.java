class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=target-nums[i];
            if(hp.containsKey(key)){
                return new int []{hp.get(key),i};
            }
            else{
                hp.put(nums[i],i);
            }
        }
        return new int[]{0,1};
    }
}