// You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse oreder,
// sych that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list
// Input: (7 -> 1 -> 6) + (5 -> 9 -> 2) = (2 -> 1 -> 9)
// Input: (9 -> 1 -> 1) + (1 -> 1 -> 1) = (0 -> 3 -> 2)

public class QuestionFive {
    public static Node addTwo(Node num1, Node num2) {
        int carry = 0;
        Node head = new Node(-1);
        Node headPointer = head;

        while(num1 != null || num2 != null) {
            int val1 = num1 == null ? 0 : num1.data;
            int val2 = num2 == null ? 0 : num2.data;

            int sum = (val1 + val2) % 10;
            Node newNode = new Node(sum + carry);
            headPointer.next = newNode;
            headPointer = headPointer.next;

            carry = (val1 + val2) / 10;

            if(num1 != null) {
                num1 = num1.next;
            }

            if(num2 != null) {
                num2 = num2.next;
            }
        }

        return head.next;
    }

    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node(1);
        Node c = new Node(1);

        Node d = new Node(1);
        Node e = new Node(1);


        a.next = b;
        b.next = c;

        d.next = e;


        Node g = addTwo(a, d);
        print(g);
    }

    private static void print(Node head) {
        while(head != null) {
            System.out.println(head.data + " ");
            head = head.next;
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
