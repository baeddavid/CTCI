public class EvenOddMerge {
    //Brute Force Solution
    public static Node <Integer> evenOddMerge(Node <Integer> head) {
	Node <Integer> evenHead = new Node <Integer> (-1);
	Node <Integer> oddHead = new Node <Integer> (-1);
	Node <Integer> curr = head, evenCurr = evenHead, oddCurr = oddHead;

	while(curr != null) {
	    Node <Integer> next = curr.next;
	    if(curr.data % 2 == 0) {
		evenCurr.next = curr;
		evenCurr = evenCurr.next;
	    } else {
		oddCurr.next = curr;
		oddCurr = oddCurr.next;
	    }
	    curr.next = null;
	    curr = next;
	}
	evenCurr.next = oddHead.next;
	return evenHead.next;
    }

    public static void main(String[] args) {
	Node <Integer> a = new Node <>(2);
	Node <Integer> b = new Node <>(5);
	Node <Integer> c = new Node <>(4);
	Node <Integer> d = new Node <>(7);

	a.next = b;
	b.next = c;
	c.next = d;

	Node <Integer> newHead = evenOddMerge(a);
	Node <Integer> curr = newHead;
	while(curr != null) {
	    System.out.print(curr.data + " ");
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


