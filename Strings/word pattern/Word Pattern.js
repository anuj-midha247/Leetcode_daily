/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    const sArr=s.split(" ");
    if(sArr.length!==pattern.length){
        return false;
    }
    const patternMap=new Map();
    const uniqueSet=new Set();
    for(let i=0;i<pattern.length;i++){
        if(!patternMap.has(pattern[i])){
            if(uniqueSet.has(sArr[i])){
                return false;
            }
            patternMap.set(pattern[i],sArr[i]);
            uniqueSet.add(sArr[i]);
        }
        else {
            if(sArr[i]!==patternMap.get(pattern[i])){
                return false;
            }
        }
    }
    return true;
};