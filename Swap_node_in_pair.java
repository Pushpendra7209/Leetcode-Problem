package d;
import java.util.*;

public class Swap_node_in_pair {
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}


		ListNode prev = head;
		ListNode curr = head.next;
		ListNode p = null;
		if(curr.next!=null){
			p = curr.next;
		}
		prev.next = null;
		curr.next = prev;
		head = curr;
		prev.next = p;



		if(prev.next!=null)
			System.out.println(prev.next.val);
		ListNode a = null;
		ListNode b = null;


		if(prev.next!=null && prev.next.next != null){
			a = prev.next;
			b = prev.next.next;
		}
		while(a !=null && b!=null){

			ListNode c = b.next;
			ListNode temp = b;

			b.next = null;
			b.next = a;
			a.next = null;
			prev.next = b;
			prev = a;
			a.next = c;
			a = c;
			if(c  != null)

				b = a.next;
		}

		return head;
	}
}
