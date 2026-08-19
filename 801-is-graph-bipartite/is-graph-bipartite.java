class Solution {
    public boolean isBipartite(int[][] graph) {
        int len = graph.length;
        int colour[] = new int[len];
        for(int i=0; i<len; i++){
            colour[i] = -1;
        }
        for(int i =0; i<len; i++){
            if(colour[i] == -1){
                if(bfs(i,colour,graph) == false) return false;
            }
        }
        return true;
    }
    private boolean bfs(int node ,int colour[] , int graph[][]){
        Queue<Integer> q =  new ArrayDeque<>();
        q.offer(node);
        colour[node] =0;
        while(!q.isEmpty()){
            int top = q.poll();
            for(int it : graph[top]){
                if(colour[it] == -1){
                   colour[it] = 1- colour[top];
                   q.add(it); 
                }
                else if(colour[it] == colour[top]){
                    return false;
                }
            }
        }
        return true;
    }
}