class Solution {
    public void dfs(int i, int j, boolean[][] vis, char[][] grid, int n, int m){
        if(i<0 || i>=n ||j<0 || j>=m || vis[i][j] || grid[i][j] =='0'){
            return;
        }
        vis[i][j] = true;

        dfs(i-1,j,vis,grid,n,m); //top
        dfs(i,j+1,vis,grid,n,m);  //right
        dfs(i+1,j,vis,grid,n,m);  // bottom
        dfs(i,j-1,vis,grid,n,m);   //left
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int islands = 0;
        boolean[][] vis = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] =='1' && !vis[i][j]){
                    dfs(i,j,vis,grid,n,m);
                    islands++;
                }
            }
        }
        return islands;
    }
}