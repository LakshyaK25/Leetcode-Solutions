class Solution {
    public boolean checkPowersOfThree(int n) {
        return helper(0,n);
    }
    private boolean helper( int power , int n){
        if(n==0) return true;

        if(Math.pow(3,power) > n) return false;

        boolean take = helper(power+1 , n -(int)Math.pow(3,power));
        boolean notTake = helper(power +1 , n);
        return take || notTake;
    }
}