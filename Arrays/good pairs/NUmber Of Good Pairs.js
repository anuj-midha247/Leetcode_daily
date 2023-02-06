/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    const hp=new Map();
    for(let i=0;i<nums.length;i++){
        let key=nums[i];
        if(hp.has(key)){
            let value=hp.get(key);
            value=value+1;
            hp.set(key,value);
        }
        else{
            hp.set(key,1);
        }
    }
    const mapIter = hp.values();
    let sum=0;
   
for (let key of hp.keys()) {
	let value=hp.get(key);
    value=value*(value-1)/2;
    sum+=value;
    console.log(value);
}
    return sum;
};