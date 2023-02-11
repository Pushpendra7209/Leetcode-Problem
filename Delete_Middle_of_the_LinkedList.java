package d;

public class Delete_Middle_of_the_LinkedList {
	public ListNode deleteMiddle(ListNode head) {

		if(head == null){
			return null;
		}

		ListNode temp = head;
		int size = 0;
		while (temp != null){
			size++;
			temp = temp.next;
		}
		if(size == 1){
			return null;
		}
		if(size == 2){
			head.next = null;
			return head;
		}
		ListNode slow = head; 
		ListNode fast = head;
		ListNode prev = null;

		while( fast.next != null && fast.next.next != null){
			prev = slow ;
			slow = slow.next;
			fast = fast.next.next;
		}

		if(size % 2 == 0){
			slow.next = slow.next.next;
		}
		else{
			prev.next = prev.next.next;
		}

		return head;
	}
}
