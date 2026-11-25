class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length , ans =0;
        for(int i=0; i<n; i++){
            long pro = 1 , gcd = 0, lcm = 1;
            for(int j=i; j<n; j++){
                pro *= nums[j];
                gcd = findGCD(gcd, nums[j]);
                lcm = findLCM(lcm, nums[j]);
                if(pro == lcm * gcd){
                    ans = Math.max(ans , j-i+1);
                }
            }
        }
        return ans;

    }
    private long findGCD(long a , long b){
        while(b!=0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private long findLCM(long a , long b){
        return(a / findGCD(a,b))*b;
    }
}