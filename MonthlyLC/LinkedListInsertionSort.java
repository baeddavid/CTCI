class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode current = head;

        while(current != null) {
            ListNode prev = dummy;
            while(prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            ListNode next = current.next;
            current.next = prev.next;
            prev.next = current;
            current = next;
        }
        return dummy.next;
    }

    // The normal insertion sort
    public void insertionSort(int[] A) {
        for(int i = 1; i < A.length; i++) {
            int j = i;
            int num = A[i];
            while(A[j - 1] > A[j] && j > 0) {
                A[j] = A[j - 1];
                j--;
            }
            A[j] = num;
        }
    }
}
