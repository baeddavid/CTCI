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
        ListNode curr1 = l1, curr2 = l2;
        int size1 = 0, size2 = 0;
        while(curr1 != null) {
            curr1 = curr1.next;
            size1++;
        }

        while(curr2 != null) {
            curr2 = curr2.next;
            size2++;
        }

        if(size2 > size1) {
            int temp = size2;
            size2 = size1;
            size1 = temp;

            ListNode tempNode = curr1;
            curr1 = curr2;
            curr2 = tempNode;
        }
        curr1 = l1;
        curr2 = l2;

        ListNode dummy = new ListNode();
        ListNode dummyCurr = dummy;
        while(size2 < size1) {
            ListNode newNode = new ListNode(curr1.val);
            dummyCurr.next = newNode;
            dummyCurr = dummyCurr.next;
            curr1 = curr1.next;
            size1--;
        }
    
        while(curr1 != null && curr2 != null) {
            ListNode newNode = new ListNode(curr1.val + curr2.val);
            dummyCurr.next = newNode;
            if(newNode.val == 10) {
                newNode.val = 0;
                ListNode candidate = newNode;
                while(candidate.val == 0) {
                    ListNode newCurrent = dummy.next;
                    while(newCurrent.next != candidate) {
                        newCurrent = newCurrent.next;
                    }
                    newCurrent.val = newCurrent.val + 1;
                    if(newCurrent.val == 10) {
                        newCurrent.val = 0;
                    }
                    candidate = newCurrent;
                }
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
            dummyCurr = dummyCurr.next;
        }
        return dummy.next;
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
