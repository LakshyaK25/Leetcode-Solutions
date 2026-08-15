class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int resultXorr = 0;
        boolean allZero = true;
        for(int x : nums){
            resultXorr = (resultXorr ^ x);
            if(x != 0){ // found one element which is non zero so allzero = false;
                allZero = false;
            }
        }
        if(allZero){
            return 0;
        }
        return (resultXorr == 0)?n-1 : n;
    }
}