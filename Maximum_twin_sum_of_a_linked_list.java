public class Maximum_twin_sum_of_a_linked_list {
    public int pairSum(ListNode head) {

        ListNode fast = head, slow = head;

        while(slow != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode NodeNext , prev = null;
        while(slow != null){
            NodeNext = slow.next;
            slow.next = prev;
            prev = slow;
            slow = NodeNext;
        }
        int max =0;
        while(head !=null && prev != null){
            max = Math.max(max, prev.val +head.val);
            head = head.next;
            prev = prev.next;
        }
        return max;
    }
}
