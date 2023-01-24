/**
 * @param {string} secret
 * @param {string} guess
 * @return {string}
 */
var getHint = function(secret, guess) {
    let bulls=0,cows=0;
    let str1=secret.split(""),str2=guess.split("");
    let arr1=new Array(10).fill(0);
    let arr2=new Array(10).fill(0);
    for(let i=0;i<str1.length;i++){
        if(str1[i]===str2[i]){
            bulls++;
        } else{
            arr1[str1[i]]++;
            arr2[str2[i]]++;
        }
    }
    for(let i=0;i<=9;i++){
        cows+=Math.min(arr1[i],arr2[i]);
    }
    return bulls+"A"+cows+"B";
};