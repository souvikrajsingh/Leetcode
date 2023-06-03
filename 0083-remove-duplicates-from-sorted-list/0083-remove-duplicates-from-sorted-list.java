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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode list = head;
         
        
//         reaching null we are coming out and returning the head;
         while(list != null) {
        	 if (list.next == null) {
        		 break;
        	 }
//              here basically if we find that the value that's next is 
//              same as the one we are at we are skipping it moving the connection to the next element to it which seem optimal to me so far
             
        	 if (list.val == list.next.val) {
        		 list.next = list.next.next;
        	 } else {
        		 list = list.next;
        	 }
         }
         
         return head;
    }
}