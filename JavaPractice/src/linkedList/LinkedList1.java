package linkedList;

/*
 * 	Detect a Cycle in a Linked List

	Use Case: Detect a cycle in the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 2 (cycle back to node 2) 
 */

public class LinkedList1 {

	static class ListNode{
		int val;
		ListNode next;
		ListNode(int val)
		{
			this.val=val;
		}
		
	}
	
	public static void main(String[] args) {
		
		LinkedList1 linkedList = new LinkedList1();
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next=head.next;
		
		System.out.println(linkedList.hasCycle(head));
	}

	private boolean hasCycle(ListNode head) {
		ListNode slow=head;
		ListNode fast=head.next;
		
		while(fast!=null && fast.next!=null)
		{
			if(fast==slow) return true;
			slow=slow.next;
			fast=fast.next.next;
		}
		return false;
	}

}
