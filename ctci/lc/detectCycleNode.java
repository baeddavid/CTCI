public class detectCycleNode {
    public ListNode detectCycle(ListNode head) {
	ListNode fast = head, slow = head;
	while(fast != null && fast.next != null) {
	    fast = fast.next.next;
	    slow = slow.next;
	    if(slow == fast) break;
	}

	if(fast == null || fast.next == null) return null;
	
	int cycleSize = 1;
	fast = fast.next;

	while(fast != slow) {
	    fast = fast.next;
	    cycleSize++;
	}

	ListNode advanceIter = head;
	while(cycleSize-- > 0) advanceIter = advanceIter.next;

	ListNode iter = head;
	while(advanceIter != iter) {
	    advanceIter = advanceIter.next;
	    iter = iter.next;
	}

	return iter;  
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
	val = x;
	next = null;
    }
}
	 
