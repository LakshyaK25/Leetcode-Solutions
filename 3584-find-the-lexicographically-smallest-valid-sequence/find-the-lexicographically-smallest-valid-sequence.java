class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int suff[] = new int[m];
        Arrays.fill(suff,-1);
        // right to left pass
        int i = n-1;
        int j = m-1;
        while(i>=0 && j>=0){
            if(word1.charAt(i) ==word2.charAt(j)){
                suff[j] = i;
                j--;
            }
            i--;
        }
        int ans[] = new int[m];
        boolean canSkip = true;
        int size = 0;
        j=0;
        for(i=0; i<n && j<m; i++){
            if(word1.charAt(i) == word2.charAt(j)){
                ans[size++] = i;
                j++;
            }
            else if(canSkip && (j==m-1 || i<suff[j+1])){
                canSkip = false;
                ans[size++] = i;
                j++;
            }
        }
        if(j==m) return ans;
        return new int[0];
    }
}