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

	// Optimal Solution
	Node <Integer> reverseSubListOptimal(Node <Integer> head, int s, int f) {
		Node <Integer> dummy = new Node<>(0);
		Node <Integer> dummyCurr = dummy;
		int k = 1;

		while(k++  < s) {
			dummyCurr = dummyCurr.next;
		}

		Node <Integer> iterator = new dummyCurr.next;
		while(k < f) {
			Node <Integer> temp = iterator.next;
			iterator.next = temp.next;
			temp.next = dummyCurr;
			dummyCurr.next = temp;
		}

		return dummy.next;
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