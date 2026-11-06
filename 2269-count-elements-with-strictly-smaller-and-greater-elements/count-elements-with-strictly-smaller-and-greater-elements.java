class Solution {
    public int countElements(int[] nums) {
        int cnt = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
            
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > min && nums[i] < max) cnt++;
        }
        return cnt;
    }
}