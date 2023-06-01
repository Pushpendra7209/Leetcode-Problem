public class Partision_list {
    public ListNode partition(ListNode head, int x) {
        ListNode as = null, ae = null, bs = null, be = null;
        ListNode curr = head;
        // System.out.println(curr.val);
        while(curr != null)
        {
            if(curr.val < x)
            {
                if(as == null && ae == null)
                {
                    as = ae = curr;
                    // ae = ae.next;

                }
                else
                {
                    ae.next = curr;
                    ae = ae.next;
                }
            }
            else{
                if(bs == null && be == null)
                {
                    bs = be = curr;
                    // be = be.next;
                }
                else
                {
                    be.next = curr;
                    be = be.next;
                }
//System.out.println(curr.val);
            }
            curr = curr.next;
        }
        // System.out.println(as.val +"  "+bs.val);
        if(as == null || bs == null)
        {
            return head;
        }
        ae.next = bs;
        be.next = null;

        return as;
    }
}
