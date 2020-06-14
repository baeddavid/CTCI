public class SumLists {
Node <Integer> sumLists(Node <Integer> num1, Node <Integer> num2) {
		int carry = 0, sum;
		Node <Integer> newHead = null;
		Node <Integer> prev = null;
		Node <Integer> temp = null;

		while(num1 != null || num2 != null) {
			sum = carry + (num1 != null ? num1.t : 0) + (num2 != null ? num2.t : 0);
			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;
			temp = new Node<> (sum);
            
			if(newHead == null) newHead = temp;
			else prev.next = temp;

			prev = temp;
			if (num1 != null) num1 = num1.next;
			if (num2 != null) num2 = num2.next;
		}

        if(carry > 0)
            temp.next = new Node <Integer> (carry);

		return newHead;
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