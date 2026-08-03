class Solution {
    public int orangesRotting(int[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        int min = 0 , fresh =0;
        Deque<int[]> q = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j] == 1) fresh++;
            }
        }
        if(fresh ==0) return 0;
        int dx[] = {-1,1,0,0};
        int dy[] = {0,0,-1,1};
        while(!q.isEmpty() && fresh >0){
            int size = q.size();
            for(int i=0; i<size; i++){
                int []curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                
                for(int j=0; j<4; j++){
                    int newrow = row + dx[j];
                    int newcol = col + dy[j];
                    if(newrow >=0 && newcol >=0 && newrow<n && newcol<m && grid[newrow][newcol] == 1){
                        grid[newrow][newcol] = 2;
                        q.add(new int[]{newrow,newcol});
                        fresh--;
                    }
                }
            }
            min++;
        }
        return fresh==0 ? min :-1;
    }
}