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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       l1 = reverse(l1);
       l2 = reverse(l2);
       ListNode ans = helper(l1,l2,0);

       return reverse(ans);
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next; 
        }
        return prev;
    }
    public ListNode helper(ListNode l1, ListNode l2, int carry)
    {
        ListNode head = null;
        ListNode curr = null;
        while(l1!=null || l2 !=null || carry != 0)
        {
            int a = (l1 != null ? l1.val : 0);
            int b = (l2 != null ? l2.val : 0);

            int sum = a + b + carry ;
            carry = sum /10;
            int value = sum % 10;

            ListNode newNode = new ListNode(value);
            if(head == null){
                head = newNode;
                curr = newNode;
            }
            else{
                curr.next = newNode;
                curr = curr.next;
            }
            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);
        }
        return head;
    }
}
