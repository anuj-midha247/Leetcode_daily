/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    const hp={};
    for(const i of nums){
        hp[i]=hp[i]+1||1;
    }
    for(const key in hp){
        if(hp[key]>Math.floor(nums.length/2)){
            return key;
        }
    }
};