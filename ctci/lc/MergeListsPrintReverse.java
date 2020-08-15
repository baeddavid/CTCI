public class MergeListsPrinteReverse {
    public void mergePrint(Node l1, Node l2) {
        l1 = sort(l1);
        l2 = sort(l2);

        Node mergedListR = reverse(merge(l1, l2));
        print(mergedListR);
    }
    private Node sort(Node l) {
        if(l == null || l.enxt == null) {
            return l;
        }

        Node middle = getMiddle(l);
        Node middleNext = middle.next;
        middle.next = null;

        node left = sort(l);
        node right = sort(middlNext);
        node sortedList = merge(left, right);
        return sortedList;
    }


    // Returns either the middle node or floor(A[middle]) in an even length array
    private Node getMiddle(Node l) {
        if(l == null) {
            return l;
        }
        Node slow = l, fast = l;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node l1, Node l2) {
        Node newList = new Node(-1);
        Node curr = newList;
        while(l1 != null && l1 != null) {
            if(l1.data <= l2.data) {
                curr.next = l1;
            } else {
                curr.next = l2;
            }
            curr = curr.next;
        }

        curr.next = (l1 == null) ? l2 : l1;
        return newList.next;
    }

    private Node reverse(Node l) {
        Node current = l;
        Node prev = null;

        while(current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private void print(Node l) {
        Node current = l;
        while(current != null) {
            System.out.print(current.data);
            current = current.next;
        }
    }
}
