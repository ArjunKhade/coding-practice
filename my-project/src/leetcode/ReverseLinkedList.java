package leetcode;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;

		/*
		 * Just to simply further: Result of 1st iteration of 4 lines of code in tha
		 * while loop: 
		 * next = 2 
		 * 1-> null
		 * prev = 1
		 * head =2
		 * 
		 * 2nd: //now, 
		 * next = 3 
		 * // 2->1 (remember 1 already points to null) 
		 * // prev = 2
		 * // head = 3
		 * 
		 * and so on
		 */

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
