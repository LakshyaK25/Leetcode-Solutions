class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char ch[] = s.toCharArray();
        for(int start=0; start<n; start += 2*k){
            int l = start;
            int r = Math.min(start + k -1,n-1);
            while(l < r){
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}