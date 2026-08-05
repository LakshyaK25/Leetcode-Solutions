class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        //step 1
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<invocations.length; i++){
            adj.get(invocations[i][0]).add(invocations[i][1]);
        }
        boolean vis[] = new boolean[n+1];
        dfs(adj,k,vis);
        boolean flag = true;
        for(int i=0; i<invocations.length; i++){
            int u=invocations[i][0] , v = invocations[i][1];
            if(!vis[u]){
                if(vis[v]){
                    flag = false;
                }
            }
        }
        List<Integer> ans = new ArrayList<>(); 
        for(int i = 0; i < n; i++) {
            if(flag && vis[i]) continue; 
            ans.add(i);
        }
        return ans; 
    }
    private void dfs(List<List<Integer>> adj, int k, boolean[] vis){
        if(vis[k]) return;
        vis[k] = true;
        for(Integer i :adj.get(k)){
            if(!vis[i]) dfs(adj,i,vis);
        }
    }
}