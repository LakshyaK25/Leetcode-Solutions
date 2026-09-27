class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                StringBuilder temp = new StringBuilder();
                while(!st.isEmpty() && st.peek()!= '('){
                    temp.append(st.pop());
                }
                if(!st.isEmpty()){
                    st.pop();
                }
                for(int j=0; j<temp.length(); j++){
                    st.push(temp.charAt(j));
                }
            }
            else{
                st.push(ch);
            }

        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
        
    }
}