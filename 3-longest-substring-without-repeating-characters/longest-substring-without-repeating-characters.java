class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0, r=0 , maxLen=0;
        int[] freq = new int[256];
        while(r<n){
            char rightC = s.charAt(r);
            freq[rightC]++;
            while(freq[rightC] > 1){
                char leftc = s.charAt(l);
                freq[leftc]--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}