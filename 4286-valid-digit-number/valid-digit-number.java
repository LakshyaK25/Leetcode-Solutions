class Solution {
    public boolean validDigit(int n, int x) {
        String l = Integer.toString(n);
        char c = l.charAt(0);
        int a = c-'0';
        if(a ==x) return false; // starting is same
        while(n!=0){
            int temp = n%10;
            if(temp == x) return true;  // atleast one occurance
            n = n/10;
        }
        return false;
    }
}