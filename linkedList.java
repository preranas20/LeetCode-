//LinkedList Implementation
/*Design your implementation of the linked list. You can choose to use the singly linked list or the doubly linked list. A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node. If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement these functions in your linked list class:

get(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.
addAtHead(val) : Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
addAtTail(val) : Append a node of value val to the last element of the linked list.
addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.
Example:

MyLinkedList linkedList = new MyLinkedList();
linkedList.addAtHead(1);
linkedList.addAtTail(3);
linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
linkedList.get(1);            // returns 2
linkedList.deleteAtIndex(1);  // now the linked list is 1->3
linkedList.get(1);            // returns 3
Note:

All values will be in the range of [1, 1000].
The number of operations will be in the range of [1, 1000].
Please do not use the built-in LinkedList library.*/

/**Test Case:
["MyLinkedList","addAtHead","addAtIndex","addAtIndex","addAtTail","get"]
[[],[0],[1,9],[1,5],[7],[1]]
Output: [null,null,null,null,null,5]
*/


class MyLinkedList {
    
   
    /** Initialize your data structure here. */
     class Node{
       int value;
       Node next;
       Node(int val){
           this.value = val;
       } 
    }
    
    Node head;
    int size;

    
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
       //if index is greater than the or equal to size of linkedList ,return -1
       if(index>=size)
           return -1;
       Node current = head; //intialize the current node at the starting node of linkedList
       for(int i=0;i<index;i++)
            current = current.next;  //move the current node pointer while traversing the list
        
        return current.value;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        //if size of list is greater than 0, push the new node before the starting node of list(the one which head points)
        if(size>0){
        
            node.next = head;
        }
        //in case the list is empty(or in sequance of above condition),intialize head pointer to the new node 
         head = node;
         size++;
         
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
       //if list is empty, the first node would be last node
	   if(size==0)
		   addAtHead(val);
	   else {
           Node node = new Node(val);
	       Node current = head;
           if(size == 1) //in case there is just one node,point the next pointer of head towards the new node
                head.next = node;
           else {
               
	        for(int i=0;i<size-1;i++) {
		        current = current.next;
	          }
	  
	         current.next = node;
	   
	         }
            size++; 
       }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
       //if index to insert node is 0,node is to be added at starting of list
        if(index == 0)
            addAtHead(val);
        //if index is equal to length of node,the node will be appended at the end
        else if(index == size){
            addAtTail(val);
        }
        else{
        Node node = new Node(val);   
        Node current = head;
        Node prev = null;
        if(index<size){
         for(int i=0;i<index;i++){
           
             prev = current; //to retain previous node to refer to the new node
            
             current = current.next; //to get the next node ,new node can refer to this node
        
        }
        node.next = current;    
        prev.next = node;
        size++;
            
        }
        
      }
      
        
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
        if(index<0 && index>=size)
            return;
        else if(index == 0){
            head = null;
            size--;
        }else{
            
          if(index<size){
            Node current = head;
            Node prev = null;
            
            for(int i=0;i<index;i++){
                  
                 prev = current;
            
                 current = current.next;
              }
              
              Node nextNode = current.next;
              prev.next = nextNode;
              current.next=null;
               size--;
          }
              
        }
        
    }
}


 /* Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */