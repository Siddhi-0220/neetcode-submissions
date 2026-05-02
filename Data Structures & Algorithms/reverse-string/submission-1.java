class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] rev = new char[n];
        for(int i = 0 ; i<n ; i++){
            rev[n - 1 - i] = s[i];
        }
        for(int i = 0;i<n;i++){
            s[i] = rev[i];
        }

        
    }
}