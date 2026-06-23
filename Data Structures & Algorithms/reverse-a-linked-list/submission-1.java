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
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head; //0

        while(curr != null){
         ListNode next = curr.next; //1
         curr.next = prev;  
         prev = curr; //0
         curr = next; // 1

        }

        return prev;

      
    }
}
