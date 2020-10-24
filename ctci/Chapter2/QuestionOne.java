import java.util.Set;
import java.util.HashSet;

// Write code to remove duplicates from an unsorted linked list
public class QuestionOne {
    // Using a buffer to delete duplicate nodes
    public static void deleteDuplicate(Node head) {
        Set<Integer> set = new HashSet<>();
        Node prev = null;

        while(head != null) {
            if(set.contains(head.data)) {
                prev.next = head.next;
            } else {
                set.add(head.data);
                prev = head;
            }
            head = head.next;
        }
    }

    // No buffer
    public static void deleteDuplicateNoBuffer(Node head) {
        Node current = head;
        while(current != null) {
            Node fast = current;
            while(fast.next != null) {
                if(fast.next.data == current.data) {
                    fast.next = fast.next.next;
                } else {
                    fast = fast.next;
                }
            }
            current = current.next;
        }
    }
}
