public class DeleteKthNodeFromEnd {
    public Node <Integer> deleteKthNode(Node <Integer> head, int k) {
		Node <Integer> slow = head, fast = head;
		while(fast != null && k != 0) {
			fast = fast.next;
            k--;
		}

		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
    
            
		Node <Integer> delete = slow.next;
		slow.next = slow.next.next;
		return delete;
	}

	public Node <Integer> deleteKthNodeBruteForce(Node <Integer> head, int k) {
		int length = 0;
		Node <Integer> curr = head;

		while(curr != null) {
			length++;
			curr = curr.next;
		}

		curr = head;
        int key = length - k;
		while(key > 1) {
			curr = curr.next;
            key--;
		}

		Node <Integer> delete = curr.next;
		curr.next = curr.next.next;
		return delete;
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