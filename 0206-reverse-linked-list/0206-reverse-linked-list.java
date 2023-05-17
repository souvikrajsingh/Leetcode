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
        
        // dummy node 
        ListNode newHead = null;
        
        while(head!=null){
            
            ListNode next = head.next; // creating a node called next that stores the add
            head.next= newHead;
            newHead= head;
            head = next;
        }
        return newHead;
    }
}