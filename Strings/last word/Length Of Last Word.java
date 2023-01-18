class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int last_index=s.lastIndexOf(' ')+1;
        return s.length()-last_index;
    }
}