package dsa;

public class LinkedListQuestions {
	
	
	
//	public void insertRec(int val, int index) {
//		head = insertRec(val, index, head);
//	}
//	
//	
//	private Node insertRec(int val, int index, Node node) {
//		if(index == 0) {
//			Node temp = new Node(val);
//			 temp.next = node;
//			 return temp;
//		}
//		
//		node.next = insertRec(val, index--, node.next);
//		return node;
//	}
	
	
	
	
	
	
	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {

			this.data = data;
			this.prev = null;
			this.next = null;
		}

	}
	
	

	public static void main(String[] args) {
		
	}

}
