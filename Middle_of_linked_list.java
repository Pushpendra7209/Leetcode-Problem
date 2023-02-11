package d;

public class Middle_of_linked_list {
	
	    public ListNode middleNode(ListNode head) {
	        int size=0; 
	        ListNode curr=head;
	        while(curr!=null){
	            curr=curr.next;
	            size++;
	        }
	      System.out.println(size);
	        ListNode turtle=head;
	        ListNode hare=head;
	        while(hare.next!=null && hare.next.next!=null){
	            turtle=turtle.next;
	            hare=hare.next.next;
	        }
	        if(size%2==0){
	            return turtle.next;
	        }
	        return turtle;
	    }
	}

