// Write code to partition a linked list around a value x, such that all nodes lessthan x come before all nodes gresater than or eqwual to x.
// If x is contained within the list, the values of x only need to be after the elements less than x. The partition element x can appear anywhere in the "right partition"
// it does not need to appear between the left and right partitions

public class QuestionFour {
    public static Node partition(Node head, int x) {
        Node lessThan = new Node(-1);
        Node greaterThan = new Node(-1);
        Node lessThanHead = lessThan, greaterThanHead = greaterThan;

        Node current = head;
        while(current != null) {
            Node next = current.next;
            if(current.data < x) {
                lessThan.next = current;
                lessThan = lessThan.next;
            } else {
                greaterThan.next = current;
                greaterThan = greaterThan.next;
            }
            current.next = null;
            current = next;
        }
        lessThan.next = greaterThanHead.next;
        return lessThanHead.next;
    }

    public static Node partitionFast(Node node, int x) {
        Node head = node, Node tail = node;
        while(node != null) {
            Node next = node.next;
            if(node.data < x) {
                head.next = node;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail = null;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(5);
        Node e = new Node(10);
        Node f = new Node(2);
        Node g = new Node(1);

        a.next = b;
        b.next = c;
        c.next= d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node answer = partition(a, 5);
        while(answer != null) {
            System.out.println(answer.data + " ");
            answer = answer.next;
        }
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
