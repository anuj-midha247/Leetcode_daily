class Solution {
    public boolean isAnagram(String s, String t) {
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-97]++;
        }
         for(int i=0;i<t.length();i++){
            hash[t.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++){
            if(hash[i]!=0){
                return false;
            }
        }
        return true;
    }
}