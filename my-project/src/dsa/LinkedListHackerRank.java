package dsa;

public class LinkedListHackerRank{
	/*
	 * ************************************insertNodeAtTail******************

static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
       SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
	   
       if(head == null){
               head = newNode;
               return head;
           }
		   
       SinglyLinkedListNode cur = head;
       while(cur.next!=null){
           cur = cur.next;
       }
       
       cur.next=newNode;
       return head;
    }
	
	******************************insertNodeAtHead*****************************
	
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
      SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
	  
      if(llist == null){
          llist = newNode;
          return llist;
      }
  
      newNode.next =llist;
      llist=newNode;
      return llist;
    }

***************************************Print LinkedList data************
static void printLinkedList(SinglyLinkedListNode head) {
    
     if(head==null){
        return;
         }
		 
         SinglyLinkedListNode cur = head;
         while(cur!=null){
             System.out.println(cur.data);
             cur=cur.next;
         }
    
       return;
    }
	
	****************************************Reverse Linked List Print******************
	
	    static  void reversePrint(SinglyLinkedListNode head) {
    // Write your code here
    if(head==null)return;
    Stack<SinglyLinkedListNode> stack = new Stack<>();
    SinglyLinkedListNode cur = head;

    while(cur !=null){
        stack.push(cur);
        cur=cur.next;
    }

    while(!stack.isEmpty()){
        SinglyLinkedListNode temp = stack.pop();
        System.out.println(temp.data);
    } 

    }
	
	****************************************ReverseLinked List (best)************************************
	public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
   
       if(head == null) return head;
	   
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode cur = head;
        
        while(cur!=null){
            SinglyLinkedListNode next = cur.next;
            cur.next=prev;
            prev = cur;
            cur=next;
        }
        
        return prev;

    }
	
	***************************************DeleteNode At Given Position***********************************
	
	public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
    
      if(head == null){
        return head;
      }
      if(position == 0){
        return head.next;
      }
      
      int count = 0;
      SinglyLinkedListNode cur  = head;
      
      while(count<position-1){
          cur = cur.next;
          count++;
      }
      
      cur.next = cur.next.next;
      return head;
	  
    }
	
	****************************************** compare2LinkedLists ********************************
	
	 static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		 
         if(head1 == null && head2 == null)return true;
         SinglyLinkedListNode n1 = head1;
         SinglyLinkedListNode n2 = head2;
         
         while(n1!=null && n2!=null){
             if(n1.data!=n2.data ){
                 break;
             }
             if(n1.next==null && n2.next == null){
                 return true;
             }
             n1=n1.next;
             n2=n2.next;
         }
         
         return false;
    }
	
	//Using recursion 
	
	 static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
         if(head1 == null && head2 == null)return true;
         if(head1 == null && head2 != null)return false;
         if(head1 != null && head2 == null)return false;
         if(head1.data !=  head2.data )return false;
    
         return compareLists(head1.next,head2.next);
    }
	
	******************************************GetNode PositionFromLast Given*********************************
	public static int getNode(SinglyLinkedListNode head, int positionFromTail) {
  
    SinglyLinkedListNode pointer_node = head;
    int counter = 0;
	
    while(head != null){
        head=head.next;
        if(counter<positionFromTail){
            counter++;
        }else{
            pointer_node=pointer_node.next;
        }
    }
   
      return pointer_node.data;
    }
	
	***********************************************************************************
	 * 
	 * 
	 */
}