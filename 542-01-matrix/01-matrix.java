class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        if(mat == null || n==0 || m==0) return new int[0][0];
        int max = n * m;
        Queue<int[]> q = new LinkedList<>();
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 0){
                    q.offer(new int[]{i , j});
                }
                else mat[i][j] = max;
            }
        }
        int directions[][] = {{1,0} , {-1,0} , {0,1} , {0,-1}};
        while(!q.isEmpty()){
            int [] cell = q.poll();
            for(int[] dir : directions){
               int r = cell[0] + dir[0], c = cell[1] + dir[1];
                if (r >= 0 && r < n && c >= 0 && c < m && mat[r][c] > mat[cell[0]][cell[1]] + 1) {
                    q.offer(new int[]{r, c});
                    mat[r][c] = mat[cell[0]][cell[1]] + 1;
                }
            } 
            
        }
        return mat;
    }
}