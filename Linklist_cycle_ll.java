public class Solution {
	    public ListNode detectCycle(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	          int length = 0;
	        while(fast!=null && fast.next!= null){
	             slow = slow.next;
	            fast = fast.next.next;
	            // fast=fast.next;
	           
	            if(fast == slow ){
	                ListNode temp = slow;
	              
	                do{
	                    temp = temp.next;
	                    ++length;
	                }
	                while(slow != temp);
	                break;
	            }
	           
	        }
	        if(length == 0){
	                return  null;
	        }
	        ListNode first = head;
	        ListNode second = head;
	        while(length > 0){
	            second = second.next;
	            length--;
	        }
	        while(first != second ){
	            first = first.next;
	            second = second.next;
	        }
	        return first;
	    }
	}