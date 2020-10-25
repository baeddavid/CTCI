// Implement an algorithm to delete a node in the middle of a singly linked list,
// given only access to that node.

public QuestionThree {
    public static void deleteMiddle(Node delete) {
        // Copy over data from the node next to current
        delete.data = delete.next.data;
        delete.next = delete.next.next;
    }
}
