class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[]c=s.toCharArray();
        while(i<j){
            while(i<j&&!isVowel(c[i])){
                i++;
            }
            while(i<j&&!isVowel(c[j])){
                j--;
            }
            if(i>=j){
                break;
            }
            swap(i,c,j);
            i++;
            j--;
        }
        return new String(c);
    }
    public static  void swap(int i,char[]c,int j){
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
    }
    public static boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'
        ||c=='U';
    }
}