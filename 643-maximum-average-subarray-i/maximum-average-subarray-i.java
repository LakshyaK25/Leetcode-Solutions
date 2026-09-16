class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0, left=0, max = Integer.MIN_VALUE;
        int n =nums.length;
        for(int right=0; right<n; right++){
            sum += nums[right];
            if(right - left +1 ==k){
                max = Math.max(sum,max);
                sum -= nums[left];
                left++;
            }
        }
        double avg = (double) max / k;
        return (double) avg;
    }
}