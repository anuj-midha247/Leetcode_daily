/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
    let sum=0;
    for(let i=0;i<k;i++){
        sum+=nums[i];
    }
    let max_avg=sum/k,j=0;
    for(let i=k;i<nums.length;i++){
        sum+=nums[i]-nums[j++];
        let avg=sum/k;
        if(avg>max_avg){
            max_avg=avg;
        }
    }
    return max_avg;
};