class Solution {
    public boolean isPalindrome(String s) {

        String newStr = s.replaceAll("[^a-zA-Z0-9]", "");
        newStr = newStr.toLowerCase();

        StringBuilder sb = new StringBuilder(newStr);
        String rev = sb.reverse().toString();
        return newStr.equals(rev); 

    //     if(!newStr.equals(rev)){
    //         return false;
    //     }
    // return true;
    }
}
