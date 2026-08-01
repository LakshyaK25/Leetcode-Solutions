class Solution {
    public boolean predictTheWinner(int[] nums) {
        return Netscore(nums, 0 , nums.length-1) >=0;
    }
    public int Netscore(int nums[] , int i, int j){
        if(i==j) return nums[i];
        int pickLeft = nums[i]- Netscore(nums,i+1,j);
        int pickRight = nums[j] - Netscore(nums , i, j-1);
        return Math.max(pickLeft,pickRight);
    }
}