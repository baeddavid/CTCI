public class IntersectionOfTwoLinkedLists {
	Node <Integer> getIntersectionNode(Node <Integer> headA, Node <Integer> headB) {
		Node <Integer> currA = headA, currB = headB;
		int lengthA = 0, lengthB = 0;

		while(currA != null) {
			lengthA++;
			currA = currA.next;
		}

		while(currB != null) {
			lengthB++;
			currB = currB.next;
		}

		currA = headA;
		currB = headB;

		Node <Integer> longList = lengthA > lengthB ? currA : currB;
		Node <Integer> shortList = lengthA < lengthB ? currA : currB;

		int longListLength = lengthA > lengthB ? lengthA : lengthB;
		int shortListLength = lengthA < lengthB ? lengthA : lengthB;

		while(longListLength != shortListLength) {
			longList = longList.next;
			longListLength--;
		}

		while(longList != null && shortList != null) {
			if(longList == shortList)
				return shortList;
			longList = longList.next;
			shortList = shortList.next;
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