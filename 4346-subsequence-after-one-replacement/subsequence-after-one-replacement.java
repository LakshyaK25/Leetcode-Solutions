class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;

        int m = s.length(), n = t.length();
        int[] pre = new int[n + 1];
        int[] suf = new int[n + 1];

        // 1. Build Prefix Array
        int idx = 0;
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i];
            if (idx < m && s.charAt(idx) == t.charAt(i)) {
                pre[i + 1]++;
                idx++;
            }
        }

        // Quick check if s is already a valid subsequence without any replacements
        if (pre[n] == m) return true;

        // 2. Build Suffix Array
        idx = m - 1;
        for (int j = n - 1; j >= 0; j--) {
            suf[j] = suf[j + 1];
            if (idx >= 0 && s.charAt(idx) == t.charAt(j)) {
                suf[j]++;
                idx--;
            }
        }

        // 3. Check for replacement
        for (int i = 0; i < n; i++) {
            if (pre[i] + suf[i] == m) return true;
            if (pre[i] + suf[i + 1] >= m - 1) return true;
        }

        return false;
    }
}