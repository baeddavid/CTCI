class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middleNode = slow;
        if(fast != null) { slow = slow.next; }

        middleNode.next = null;
        ListNode secondHalf = reverseList(slow, null);

        return listsMatch(head, secondHalf);
    }

    private boolean listsMatch(ListNode listA, ListNode listB) {
        while(listA != null && listB != null) {
            if(listA.val != listB.val) { return false; }
            listA = listA.next;
            listB = listB.next;
        }
        return true;
    }

    private reverseList(ListNode head, ListNode end) {
        ListNode prev = null;
        ListNode current = head;

        while(current != end) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
