// Implement a function check if a linked list is a palindrome.

public class QuestionSix {
    // The one caveat we need to check is if the list is even or odd since that determines how we will check the list.
    public static boolean isPalindrome(Node head) {
        Node current = head, fast = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = current;
            current = current.next;
            fast = fast.next.next;
        }

        boolean isPalindromeBool = false;
        // If fast is null then there are an even number of nodes in the list.
        if(fast == null) {
            // Get the second list
            Node secondList = current.next;
            current.next = null;
            // Reverse the second list
            secondList = reverseList(secondList);
            // Then compare both lists
            isPalindromeBool = compareLists(head, secondList);
            // Restore the second list to its original ordering
            secondList = reverseList(secondList);
            // Reconnect the lists
            current.next = secondList;
        } else {
            Node secondList = current.next;
            current.next = null;
            // Disconnext the middle node from the list
            prev.next = null;
            secondList = reverseList(secondList);
            isPalindromeBool = compareLists(head, secondList);
            secondList = reverseList(secondList);
            // Reconenct the middle node
            prev.next = current;
            current.next = secondList;
        }
        return isPalindromeBool;
    }

    private static Node reverseList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private static boolean compareLists(Node a, Node b) {
        while(a != null && b != null) {
            if(a.data != b.data) {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(isPalindrome(a));
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
