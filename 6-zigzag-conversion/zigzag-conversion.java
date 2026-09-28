class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        String ans[] = new String[numRows];
        for(int i=0; i<numRows; i++){
            ans[i] = "";
        }
        int i=0;
        while(i < n){
            for(int index=0; index<numRows && i<n; index++){
                ans[index] += s.charAt(i++);
            }
            for(int index = numRows-2; index >0 && i<n; index--){
                ans[index] += s.charAt(i++);
            }
        }
        String res = "";
        for(String str : ans){
            res += str;
        }
        return res;
    }
}