public class AddNumbers2 {
    public static void main(String[] args) {
        ListNode a = new ListNode(7);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(3);

        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;

        e.next = f;
        f.next = g;

        ListNode add = addTwoNumbers(a, e);
        print(add);
    }

    public static void print(ListNode node) {
        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size1 = size(l1), size2 = size(l2);

        // size 1 will be the larger of the two lists
        if(size2 > size1) {
            ListNode temps = l1;
            l1 = l2;
            l2 = temps;
            
            int temp = size1;
            size1 = size2;
            size2 = temp;
        }

        ListNode result = null;
        ListNode n = null;
        ListNode curr1 = l1, curr2 = l2;

        System.out.println(size1);
        System.out.println(size2);
        while(size1 > size2) {
            size1--;
            n = new ListNode(curr1.val);
            n.next = result;
            curr1 = curr1.next;
            result = n;
        }

        while(curr1 != null && curr2 != null) {
            n = new ListNode(curr1.val + curr2.val);
            curr1 = curr1.next;
            curr2 = curr2.next;
            n.next = result;
            result = n;
        }

        int carry = 0;
        result = null;
        while(n != null) {
            n.val += carry;
            if(n.val >= 10) {
                n.val = n.val % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode buffer = n.next;
            n.next = result;
            result = n;
            n = buffer;
        }

        if(carry > 0) {
            n = new ListNode(1);
            n.next = result;
            result = n;
        }
        return result;
    }

    private static int size(ListNode a) {
        int size = 0;
        while(a != null) {
            size++;
            a = a.next;
        }
        return size;
    }
}

class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {  }
    public ListNode(int val) {
        this.val = val;
    }
}
