/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
    let l=0,r=s.length-1;
    let res=s.split("");
    let vowels=new Set(['a','e','i','o','u','A','E','I','O','U']);
    while(l<r){
        if(!vowels.has(res[l])){
            l++;
        }
        else if(!vowels.has(res[r])){
            r--;
        }
        else{
            [res[l],res[r]]=[res[r],res[l]];
            l++;
            r--;
        }
    }
    return res.join('');
};