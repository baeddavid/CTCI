public class RemoveElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode current = head, prev = dummy;
		while(current != null) {
			if(current.val == val) {
				prev.next = current.next;
			} else {
				prev = prev.next;
			}
			current = current.next;
		}
		return dummy.next;
	}
}
