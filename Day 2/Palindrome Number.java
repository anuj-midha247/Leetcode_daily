class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int res=0;
        while(x>0){
            int sum=x%10;
            res=(res*10)+sum;
            x=x/10;
        }
        System.out.println(res);
        if(res==y){
            return true;
        }
        else{
            return false;
        }
    }
}