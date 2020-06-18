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
}

class Node <T> { 
	public T data;
	public Node next;

	public Node(T data) {
		this.data = data;
		next = null;
	}
}