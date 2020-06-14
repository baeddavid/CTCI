public class SumLists {
	Node <Integer> sumLists(Node <Integer> num1, Node <Integer> num2) {
		int carry = 0;
		Node <Integer> curr1 = num1;
		Node <Integer> curr2 = num2;
		Node <Integer> newHead = new Node(-1);
		Node <Integer> newCurr = newHead;

		while(curr1 != null && curr2 != null) {
			if(curr1.t + curr2.t > 10) carry = 1;
			newCurr.next = new Node <Integer> ((curr1.t + curr2.t) % 10 + carry--);
			curr1 = curr1.next;
			curr2 = curr2.next;
			newCurr = newCurr.next;
		}

		return newHead.next;
	}
}

class Node <T> {
	public T t;
	public Node next;

	public Node(T t) {
		this.t = t;
		next = null;
	}
}