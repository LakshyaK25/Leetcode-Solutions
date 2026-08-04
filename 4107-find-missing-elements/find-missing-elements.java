class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);
        int curr=  nums[0];
        for(int i=0; i<n; i++,curr++){
            if(curr < nums[i]){
                ans.add(curr);
                i--;
            }
        }
        return ans;
    }
}