public class OverlappingLists {
	public Node <Integer> overlappingLists(Node <Integer> a, Node <Integer> b) {
		int aLength = length(a);
		int bLength = length(b);

		if(aLength > bLength) {
			a = advanceByK(aLength - bLength, a);
		} else {
			b = advanceByK(bLength - aLength, b);
		}

		while(a != null && b != null && a != b) {
			a = a.next;
			b = b.next;
		}

		return a;
	}

	public Node <Integer> advanceByK(int k, Node <Integer> head) {
		while(k-- > 0) {
			head = head.next;
		}
		return head;
	}

	private int length(Node <Integer> head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
}

class Node <T> {
	public T data;
	public Node next;

	public Node(T data) {
		this.data = data;
		next = null;
	}
}