public class PartitionLinkedList {
	// Brute Force Solution creating two linked lists and then merging them
    Node <Integer> partition(Node <Integer> head, int x) {
		Node <Integer> LHead = new Node<>(-1);
		Node <Integer> GHead = new Node<>(-1);
		Node <Integer> current = head, lCurrent = LHead, gCurrent = GHead;

		while(current != null) {
			if(current.t < x) {
				lCurrent.next = current;
				lCurrent = lCurrent.next;
				current = current.next;
			} else {
				gCurrent.next = current;
				gCurrent = gCurrent.next;
				current = current.next;
			}

		}
		lCurrent.next = GHead.next;
        gCurrent.next = null;
		return LHead.next;
	}

	Node <Integer> partitionOptimal(Node <Integer> node, int x) {
		Node <Integer> head = node;
		Node <Integer> tail = node;

		while(node != null) {
            Node <Integer> next = node.next;
			if(node.t < x) {
				node.next = head;
				head = node;
			} else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
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