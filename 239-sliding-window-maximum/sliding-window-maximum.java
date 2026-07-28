// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int n = nums.length;
//         int result[] = new int [n-k+1]; 
//         for(int i=0 ; i<=n-k; i++){
//             int max = nums[i];
//             for(int j=i;j<i+k;j++){
//                 max = Math.max(max,nums[j]);
//             }
//             result[i] = max;
//         }
//         return result;
//     }
// }

//           Optimal solution using Dequeue
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            if(!dq.isEmpty() && dq.peekFirst()<= i-k){      //out of window size
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if(i >=k-1){
                result[i-k+1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}