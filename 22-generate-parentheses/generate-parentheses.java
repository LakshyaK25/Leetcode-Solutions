class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list,0,0,n);
        return res;
    }
    public void generate(List<String>list,int open, int close,int n){
        if(open == close && open ==n){
            StringBuilder sb = new StringBuilder();
            for(String s : list){
                sb.append(s);
            }
            res.add(sb.toString());
            return;
        }
        if(open<n){
            list.add("(");
            generate(list,open+1,close,n);
            list.remove(list.size()-1);
        }
        if(close<open){
            list.add(")");
            generate(list,open,close+1,n);
            list.remove(list.size()-1);
        }
    }
}