/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1 , last = -1;
        ListNode prev = head;
        ListNode curr = head.next;
        int minDistance = Integer.MAX_VALUE;
        int index = 1;
        while(curr.next != null){
            ListNode next = curr.next;
            boolean isMax = curr.val>prev.val && curr.val > next.val;
            boolean isMin = curr.val < prev.val && curr.val < next.val;

            if(isMax || isMin){
                if(first == -1){
                    first = index;
                }
                else{
                    int distance = index - last;
                    minDistance = Math.min(minDistance ,distance);
                }
                last = index;
            }
            prev = curr;
            curr = next; 
            index++;
        }
        if(first == last){
            return new int[]{-1,-1};
        }
        int maxDistance =  last-first;
        return new int[]{minDistance,maxDistance};
    }
}