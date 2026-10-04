class Solution {
    public int minRotations(String s) {
        int pre =0, ans = 0;
        int curr = 0;
        for(int i=0; i<s.length(); i++){
            pre = s.charAt(i)-'0';
            int diff = Math.abs(curr-pre);
            int rot = Math.min(diff,10-diff);
            ans += rot;
            curr = pre;
        }
        return ans;
    }
}