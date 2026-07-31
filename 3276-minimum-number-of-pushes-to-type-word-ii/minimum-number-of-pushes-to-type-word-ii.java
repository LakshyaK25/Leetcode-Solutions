class Solution {
    public int minimumPushes(String word) {
        int n =  word.length();
        Integer[] freq = new Integer[26];
        Arrays.fill(freq,0);
        for(int i=0; i<n; i++) freq[word.charAt(i) - 'a']++;
        Arrays.sort(freq,Collections.reverseOrder());
        int ans = 0;
        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                ans += (i/8 + 1) * freq[i];
            }
        }
        return ans;
    }
}