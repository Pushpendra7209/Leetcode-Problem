public class Odd_even_linked_list {
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        ListNode os = null, oe = null, es = null, ee = null;
        int c = 0;
        while(curr != null)
        {
            c++;
            if(c % 2 != 0){
                if(os == null){
                    os = oe = curr;
                }
                else{
                    oe.next = curr;
                    oe = oe.next;
                }
            }
            else{
                if(es == null){
                    es = ee = curr;
                }
                else{
                    ee.next = curr;
                    ee = ee.next;
                }
            }
            curr = curr.next;
        }
        if(os == null || es == null){
            return head;
        }
        oe.next = es;
        ee.next = null;
        return os;
    }
}
