class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int i,k=0,l=0,last_row=rows-1,last_column=columns-1;
        List <Integer>res=new ArrayList();
        while(k<=last_row&&l<=last_column){
            for(i=l;i<=last_column;i++){
                res.add(matrix[k][i]);
            }
            k++;
            for(i=k;i<=last_row;i++){
                res.add(matrix[i][last_column]);
            }
            last_column--;
            if(k<=last_row){
                for(i=last_column;i>=l;i--){
                    res.add(matrix[last_row][i]);
                }
                last_row--;
            }
            if(l<=last_column){
                for(i=last_row;i>=k;i--){
                    res.add(matrix[i][l]);
                }
                l++;
            }
        }
        return res;
    }
}