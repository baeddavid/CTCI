public class ReverseList {
    Node <Integer> reverseList(Node <Integer> L) {
        Node <Integer> current = L, prev = null;
        while(current != null) {
            Node <Integer> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
