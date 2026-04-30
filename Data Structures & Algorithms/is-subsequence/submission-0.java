class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for(char ch : sChar){
            boolean found = false;
            while(j < tChar.length){
                if(tChar[j] == ch){
                    found = true;
                    j++;
                    break;
                }
                j++;
            }
        if (!found) return false;
        }
        return true;
    }
}