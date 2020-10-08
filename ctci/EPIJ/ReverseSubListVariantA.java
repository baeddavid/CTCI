public class ReverseSubListVariantA {
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void print(Node head) {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
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

        Node reverse = reverseList(a);
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
