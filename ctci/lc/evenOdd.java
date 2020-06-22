public class evenOdd {
    public ListNode evenOdd(ListNode head) {
	ListNode evenHead = new ListNode(-1);
	ListNode oddHead = new ListNode(-1);
	ListNode evenCurr = evenHead, oddCurr = oddHead, curr = head;
	boolean isOdd = true;
	
	while(curr != null) {
	    ListNode next = curr.next;
	    if(isOdd) {
		oddCurr.next = curr;
		curr.next = null;
		oddCurr = oddCurr.next;
	    } else {
		evenCurr.next = curr;
		curr.next = null;
		evenCurr = evenCurr.next;
	    }
	    isOdd = !isOdd;
	    curr = next;
	}

	oddCurr.next = evenHead.next;
	return oddHead.next;
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
