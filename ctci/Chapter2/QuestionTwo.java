// Implement an algorithm to find the kth to last element of a singly linked list
public class QuestionTwo {
    // Counting the length of the list approach
    public static Node kthFromLast(Node head, int k) {
        int length = 0;
        Node current = head;

        // Get the length of the list
        while(current != null) {
            length++;
            current = current.next;
        }
        // The kth to last element is the length - k element from the front
        current = head;
        while(length - k > 0 && current != null) {
            length--;
            current = current.next;
        }
        return current;
    }

    // Fast pointer method
    public static Node kthFromLastFast(Node head, int k) {
        Node fast = head, slow = head;
        while(k-- > 0) {
            fast = fast.next;
        }

        while(fast != null) {
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

        Node e = kthFromLastFast(a, 2);
        System.out.println(e.data);
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
