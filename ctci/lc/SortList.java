public class SortList {
    Node <Integer> splitList(Node <Integer> head) {
        Node <Integer> slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node <Integer> merge(Node <Integer> a, Node <Integer> b) {
        Node <Integer> newHead = new Node <>(-1);
        Node <Integer> newCurr = newHead;

        while(a != null && b != null) {
            if(a.data < b.data) {
                newCurr.next = a;
                a = a.next;
            } else {
                newCurr.next = b;
                b = b.next;
            }
            newCurr = newCurr.next;
        }

        if(a == null) {
            newCurr.next = b;
        }

        if(b == null) {
            newCurr.next = a;
        }

        return newHead.next;
    }
}

Node <Integer> sort(Node <Integer> head) {
    if(head == null || head.next == null) {
        return head;
    }

    Node <Integer> middle = splitList(head);
    Node <Integer> nextOfMiddle = middle.next;
    middle.next = null;
    Node <Integer> left = sort(head);
    Node <Integer> right = sort(nextOfMiddle);

    Node <Integer> sortedList = merge(left, right);
    return sortedList;
}

class Node <T> {
    public T data;
    public Node next;

    public Node(T data) {
        this.data = data;
        next = null;
    }

    void displayNode() {
        System.out.print("{" + data + "}");
    }
}
