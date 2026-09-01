class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n];
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int u=0; u<n; u++){
            for(int v : graph[u]){
                adj.get(v).add(u);
                indegree[u]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        List<Integer> safe = new ArrayList<>();
        while(!q.isEmpty()){
            int curr = q.poll();
            safe.add(curr);
            for(int it: adj.get(curr)){
                indegree[it]--;
                if(indegree[it] ==0) q.add(it);
            }
        }
        Collections.sort(safe);
        return safe;
    }
}