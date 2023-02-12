/**
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function(arr) {
    let map={};
    for(let i=0;i<arr.length;i++){
        if(!map[arr[i]]){
            map[arr[i]]=1;
        } else{
            map[arr[i]]++;
        }
    }
    let count=Object.values(map);
    return count.length===new Set(count).size;
    
};