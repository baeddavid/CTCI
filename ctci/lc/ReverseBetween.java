public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode curr = head, prev = null;

        while(m-- > 1) {
            prev = current;
             current = current.next;
             n--;
        }
        ListNode con = prev, tail = current;
        ListNode third = null;
        while(n-- > 0) {
            third = current.next;
            current.next = prev;
            prev = current;
            current = third;
        }

        if(con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = current;
        return head;
    }
}
