public class CyclicRotateList {
	// Append tail to head k times 
	private static Node <Integer> appendTailToHead(Node <Integer> head) {
		Node <Integer> tail = head, beforeTail = null;

		while(tail.next != null) {
			beforeTail = tail;
			tail = tail.next;
		}

		beforeTail.next = null;
		tail.next = head;
		return tail;
	}

	public static Node <Integer> rotateListKBrute(Node <Integer> head, int k) {
		Node <Integer> answer = head;
		for(int i = 0; i < k; i++) {
			answer = appendTailToHead(answer);
		}

		return answer;
	}

	// Optimal Solution
	private static Node <Integer> getNodePrevK(Node <Integer> head, int k) {
		Node <Integer> slow = head, fast = head;
		while(k != 0 && fast != null) {
			fast = fast.next;
			k--;
		}

		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static Node <Integer> rotateListK(Node <Integer> head, int k) {
		if(k == 0) return head;
		Node <Integer> disconnect = getNodePrevK(head, k);
		Node <Integer> curr = disconnect, next = disconnect.next;

		while(curr.next != null) {
			curr = curr.next;
		}

		curr.next = head;
		disconnect.next = null;
		return next;
	}

	public static void main(String[] args) {
		Node <Integer> a = new Node <>(1);
		Node <Integer> b = new Node <>(2);
		Node <Integer> c = new Node <>(3);
		Node <Integer> d = new Node <>(4);
		Node <Integer> e = new Node <>(5);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		Node <Integer> answer;
		answer = rotateListK(a, 3);
		Node <Integer> curr = answer;
		while(curr != null) {
			System.out.print(curr.data);
			curr = curr.next;
		}
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