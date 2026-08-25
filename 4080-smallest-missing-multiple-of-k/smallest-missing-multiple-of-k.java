class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> lk = new HashSet<>();
        for(int num : nums){
            lk.add(num);
        }
        int multiple = k;
        while(lk.contains(multiple)){
            multiple += k;
        }
        return multiple;
    }
}