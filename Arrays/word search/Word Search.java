class Solution {
    public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int columns=board[0].length;
        boolean visited[][]=new boolean[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(word.charAt(0)==board[i][j]&&search(i,j,0,word,board,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(int i,int j,int index,String word,char[][]board,boolean visited[][]){
        if(word.length()==index){
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[i].length||word.charAt(index)!=board[i][j]||visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        if(search(i+1,j,index+1,word,board,visited)||
           search(i-1,j,index+1,word,board,visited)||
           search(i,j+1,index+1,word,board,visited)||
           search(i,j-1,index+1,word,board,visited)
        ){
            return true;
        }
        visited[i][j]=false;
        return false;
    }
}