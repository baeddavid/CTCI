// Given two singly linked lists, determine if the two lists intersect. Return the intersecting node.
// Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node as then jth node of the second linked list,
// then they are intersecting

public QuestionSeven {
    public static Node getIntersection(Node a, Node b) {
        // We can find the intersection by getting the length of both lists

        Node currA = a, currB = b;
        int countA = 0, countB = 0;

        while(currA != null) {
            countA++;
            currA = currA.next;
        }

        while(currB != null) {
            countB++;
            currB = currB.next;
        }

        if(countB > countA) {
            int countT = countB;
            Node temp = currB;
            currB = currA;
            currA = temp;
            countB = countA;
            countA = countT;
        }

        while(countA > countB) {
            countA--;
            currA = currA.next;
        }

        while(currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }
}
