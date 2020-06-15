public class MergeTwoSortedLists {
	// Optimized Solution??
	public Node <Integer> mergeTwoSortedLists(Node <Integer> a, Node <Integer> b) {	
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

class Node <T> {
	public T data;
	public Node <T> next;

	public Node(T date) {
		this.data = data;
		next = null;
	}

	public void displayNode() {
		System.out.print("{" + data + "}");
	}
}