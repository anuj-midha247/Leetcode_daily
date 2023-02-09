/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    s=s.split(" ");
    let temp=[];
    for(let i=0;i<s.length;i++){
        temp.push(s[i].split('').reverse().join(''));
    }
    temp.sort();
    let res=[];
    for(let i=0;i<temp.length;i++){
        res.push(temp[i].slice(1).split('').reverse().join(''));
    }
    return res.join(" ");
};