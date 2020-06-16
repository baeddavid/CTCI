public class ReverseSublist {
	Node <Integer> reverseSublist(Node <Integer> head, int s, int f) {
		if(head == null) return null;

		Node <Integer> curr = head, prev = null;
		while(s > 1) {
			prev = curr;
			curr = curr.next;
			s--;
			f--;
		}

		Node <Integer> tail = curr, con = prev;
		Node <Integer> next = null;

		while(f > 0) {
			next = curr.next;
			cur.next = prev;
			prev = curr;
			curr = next;
			f--;
		}

		if(con != null) {
			con.next = prev;
		} else {
			head = prev;
		}

		tail.next = curr;
		return head;
	}
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