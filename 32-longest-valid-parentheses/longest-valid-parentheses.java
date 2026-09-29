class Solution {
    public int longestValidParentheses(String s) {
        int count = 0;
        int l=0, r=0;
        for(char ch : s.toCharArray()){
            if(ch =='('){
                l++;
            }
            else r++;
            if(l==r) count = Math.max(count,2*r);
            else if(r>l) l=r=0;
        }
        l=r=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '('){
                l++;
            }
            else r++;
            if(l==r) count = Math.max(count,2*l);
            else if(l>r) l=r=0;
        }
        return count;
    }
}