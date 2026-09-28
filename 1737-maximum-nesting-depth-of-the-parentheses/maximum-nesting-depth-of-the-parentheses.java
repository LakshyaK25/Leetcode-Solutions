class Solution {
    public int maxDepth(String s) {
        Stack <Character> st = new Stack<>();
        int count=0, maxCount=0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                count++;
            }
            if(ch == ')'){
                st.pop();
                count --;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
}