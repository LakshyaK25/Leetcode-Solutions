class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans ="";
        int n = s.length();
        for(int start=0; start<n; start++){
            for(int end = start; end<n; end++){
                int ones=0;
                for(int i=start; i<=end; i++){
                    if(s.charAt(i) == '1'){
                        ones++;
                    }
                }
                if(ones ==k){
                    String curr = s.substring(start,end+1);
                
                    if(ans.equals("")){
                        ans = curr;
                    }
                    else if(curr.length() < ans.length()){
                        ans = curr;
                    }
                    else if(curr.length() == ans.length() && curr.compareTo(ans)<0){
                        ans= curr;
                    }
                }
            }
        }
        return ans;
    }
}