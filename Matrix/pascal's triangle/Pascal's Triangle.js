/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    if(numRows<1){
        return [];
    }
    else if(numRows===1){
        return [[1]];
    }
    const result=[[1]];
    for(let i=1;i<numRows;i++){
        let prevRow=result[i-1];
        const currRow=[];
        currRow.push(1);
        for(let j=1;j<prevRow.length;j++){
            currRow[j]=prevRow[j]+prevRow[j-1];
        }
        currRow.push(1);
        result.push(currRow);
    }
    return result;
};