import java.util.HashSet;
import java.util.Iterator;

public class DeleteDupeNode {

    // O(n) space solution
    public static Node <Integer> deleteDuplicate(Node <Integer> node) {
        HashSet <Integer> set = new HashSet<>();
        Node <Integer> current = node;

        while(current != null) {
            set.add(current.t);
            current = current.next;
        }

        Iterator <Integer> it = set.iterator();
        Node <Integer> dummy = new Node <>(0);
        current = dummy;

        while(it.hasNext()) {
            current.next = new Node <Integer> (it.next());
            current = current.next;
        }

        return dummy.next;
    }

    // No buffer solution
    public static void deleteDuplicateNoBuffer(Node <Integer> node) {
        Node <Integer> key = node;
        while(key != null) {
            Node <Integer> fast = key;
            while(fast.next != null) {
                if(fast.next.t == key.t)
                    fast.next = fast.next.next;
                else
                    fast = fast.next;
            }
            key = key.next;
        }
    }

class Node <T> {
    public T t;
    public Node <T> next;

    public Node(T t) {
        this.t = t;
        next = null;
    }

    public void displayNode() {
        System.out.print("{" + t + "}");
    }
}