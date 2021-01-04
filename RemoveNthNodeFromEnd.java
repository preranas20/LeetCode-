//Remove Nth Node From End of List
/*

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Follow up: Could you do this in one pass?

 
Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz


*/


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
       ListNode first = head;
       ListNode start = new ListNode(0);
       ListNode second  = start;
       second.next = head; 
        
       if(head.next == null){
            if(n==1)
                return null;
       }
        
     /* s-h,f-1-> 2 -> 3 -> 4 -> 5 
        f - 2,3,4,5 idx =1
        f - 3,4,5 idx = 2 s - 1,2,3,4,5
        f - 4,5 idx = 3 s - 2,3,4,5
        f - 5 idx =4 s - 3,4,5
        f = null idx = 4 s - 4,5    
        i=0 f - 2,3,4,5
        i=1 f - 3,4,5        
        i=2 f - 4,5
        
        f - 1,2
        i=0 f-2
        i=1 f -null
        */

        for(int i=0;i<n;i++)
            first = first.next;
            
        
            
        /*s- h,f - 1,2 
            f - 2 idx =1
             temp - 1 s-2        
         
         
          f - 3,4,5 s - 1,2,3,4,5 
          f - 4,5 s - 1,2,3,4,5
          f - 5 s -2,3,4,5
          f - null s - 3,4,5
        */
        
            
        while(first != null){ 
            first = first.next;
            second = second.next;
        }
        
      //  temp - 1,2
      //  s - 2         
        ListNode temp = second.next;
        second.next = temp.next;
        temp.next = null;
            
        return start.next;   
        
    }
}