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
    public boolean isPalindrome(ListNode head) {

/* optimal solution */

// checking if the linkedlist is empty or contains one element if so, it is palindrome
if(head == null|| head.next ==null){
    return true;
}

// finding the middle of the linkedlist using the floyds slow and fast pointers
ListNode slow = head;
ListNode fast  = head;

while(fast.next!=null && fast.next.next!=null){
    slow = slow.next;
    fast = fast.next.next;
}

// sending the second half of the linkedlist starting from after middle to reverse it
slow.next = reverseList(slow.next);

slow = slow.next;

// here we are going to compare the second half of the array with the first half of the list with the second half

// two pointers head and slow pointer is being used 

while(slow!=null){
    if(head.val!=slow.val){
        return false;
    }
    head = head.next;
    slow = slow.next;
    
}
return true;

    }
 

ListNode reverseList(ListNode head){
    ListNode pre = null;
    ListNode next  =null;

    while(head!= null){
        next = head.next;
        head.next  =pre;
        pre = head;
        head= next;
    }

    return pre;
}


/*

Naive solution - adding the elements of the linkedlist into a array of type ListNode and then comparing the values by arr[index].val 

found the size of the linkedlist  
    int size = 0;
    ListNode current = head;
    
    while (current != null) {
        size++;
        current = current.next;
    }
    
    declared a ListNode Type array and then added the linkedlist elements to it 
        ListNode [] arr = new ListNode[size];
        int pointer = 0;
        while(head!=null){
            arr[pointer] = head;
            head = head.next;
            pointer++;
        }

    taking two pointers and checking if it is palindrome or not

        int pntLeft = 0;
        int pntRight = arr.length -1; 
        int flag= 0;
        while(pntLeft<=pntRight){
                if(arr[pntLeft].val != arr[pntRight].val){
                        flag = 1;
                        break;
                }
                pntLeft++;
                pntRight--;
        }


        if(flag == 0){
            return true;
        }
        else{
            return false;
        }
    }


    */
}