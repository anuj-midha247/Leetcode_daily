/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
    let res=new Array(2*nums.length);
    for(let i=0;i<nums.length;i++){
        res[i]=nums[i];
    }
    for(let i=nums.length;i<2*nums.length;i++){
        res[i]=nums[i-nums.length];
    }
    return res;
};