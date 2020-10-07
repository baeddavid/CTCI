public class ReverseSubList {
    public static Node reverseSub(Node head, Node start, Node finish) {
        Node current = head, prev = null;
        Node tail = (finish.next == null) ? null : finish.next;

        while(current.next != start) {
            current = current.next;
        }

        prev = current;
        Node reverse = current;
        current = start;

        while(current != tail) {
            Node next = current.next;
            current.next = reverse;
            reverse = current;
            current = next;
        }

        start.next = tail;
        prev.next = finish;
        return head;
    }

    public static void print(Node head) {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node reverse = reverseSub(a, b, e);
        print(reverse);
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
