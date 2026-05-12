class Solution {
    public String mergeAlternately(String word1, String word2) {
        String newStr = "";
        int n = word1.length(), m = word2.length();
        for (int i = 0; i < n || i < m; i++) {
            if (i < n) newStr += word1.charAt(i);
            if (i < m) newStr += word2.charAt(i);
        }
        return newStr;
    }
}