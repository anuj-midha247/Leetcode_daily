class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int count=1;
        int rows=matrix.length;
        int columns=matrix[0].length;
        int i,k=0,l=0,last_row=rows-1,last_column=columns-1;
        while(k<=last_row&&l<=last_column){
            for(i=l;i<=last_column;i++){
                matrix[k][i]=count;
                count++;
            }
            k++;
            for(i=k;i<=last_row;i++){
                matrix[i][last_column]=count;
                count++;
            }
            last_column--;
            if(k<=last_row){
                for(i=last_column;i>=l;i--){
                    matrix[last_row][i]=count;
                    count++;
                }
                last_row--;
            }
            if(l<=last_column){
                for(i=last_row;i>=k;i--){
                    matrix[i][l]=count;
                    count++;
                }
                l++;
            }
        }
        return matrix;
    }
}