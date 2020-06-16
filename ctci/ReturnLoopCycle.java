public class ReturnLoopCycle {
	Node <Integer> returnLoop(Node <Integer> head) {
		Node <Integer> slow = head, fast = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) {
				int count = 1;
				slow = slow.next;

				while(slow != fast) {
					count++;
					slow = slow.next;
				}

				Node <Integer> curr = head;
				while(count-- > 0) {
					curr = curr.next;
				}

				Node <Integer> loopStart = head;
				while(loopStart != curr) {
					loopStart = loopStart.next;
					curr = curr.next;
				}
				return loopStart;
			}
		}
		return null;
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