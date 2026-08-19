class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((i==0 || i==m-1 ||j==0 ||j==n-1) && grid[i][j] == 1){
                    dfs(i,j,grid);
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    result++;
                }
            }
        }
        return result;



    }
    private void dfs(int i, int j, int grid[][]){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] ==0 ){
            return;
        }
        grid[i][j] = 0;
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
        
    }
}