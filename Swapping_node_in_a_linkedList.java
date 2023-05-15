public class Swapping_node_in_a_linkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode s = null;
        ListNode t = null;
        int size =0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr=curr.next;
        }
        System.out.println(size);

        ListNode temp = head;
        int i = 0;
        while(temp != null){
            i++;
            if(i == k){
                s = temp;
            }
            if( i == size - k +1){
                t = temp;
            }
            temp = temp.next;
        }
        int a = s.val;
        s.val = t.val;
        t.val = a;

        return head;
    }
}
