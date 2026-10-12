class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s.length() , j= n-1;
        for(int i=0; i<n; i++){
            if(s.charAt(i) != s.charAt(j)) return false;
            j--;
        }
        return true;
    }
}