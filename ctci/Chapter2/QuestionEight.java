// Given a circular lihked list, implement an algorithm that returns the node at the beginning of the loop.

public class QuestionEight {
    public static Node getLoop(Node head) {
        Node slow = head, fast = head;
        do {
            slow = slow.next ;
            fast = fast.next.next;
        } while(slow != fast);

        int loopSize = 0;
        do {
            slow = slow.next;
            loopSize++;
        } while(slow != fast);

        slow = head;
        fast = head;
        while(loopSize-- > 0) {
            fast = fast.next;
        }

        while(fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        System.out.println(getLoop(a).data);
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
