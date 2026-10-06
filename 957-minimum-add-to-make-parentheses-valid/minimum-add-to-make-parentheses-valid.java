class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int opencount = 0 , unmatchedClose = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                opencount ++;
            }else{
                
                if(opencount>0)
                    opencount--;
                else unmatchedClose ++;
            }
            
            
        }
        return opencount + unmatchedClose;
    }
}