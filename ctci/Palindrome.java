public class Palindrome {
	// Brute Force Solution
	public boolean isListPalindromeBrute(Node <Integer> head) {
		Node <Integer> copy = new Node <>(-1);
		Node <Integer> current = head, copyHead = copy, prev = null;

		while(current != null) {
			copyHead.next = new Node <Integer> (current.data);
			copyHead = copyHead.next;
			current = current.next;
		}

		current = head;
		while(current != null) {
			Node <Integer> next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		current = prev;
		copyHead = copy.next;
		while(copyHead != null && current != null) {
			if(current.val != copyHead.val)
				return false;
			current = current.next;
			copyHead = copyHead.next;
		}

		return true;
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