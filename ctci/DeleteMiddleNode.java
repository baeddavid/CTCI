public class DeleteMiddleNode {
	// Given only access to the node to be deleted, delete the node.
	static void deleteMiddleNode(Node <Integer> node) {
		node.t = node.next.t;
		node.next = node.next.next;
	}
	// This is not solvable if the node to be deleted is the last node in the linked list.
}

class Node <T> {
	public T t;
	public Node next;

	public Node(T t) {
		this.t = t;
		next = null;
	}
}