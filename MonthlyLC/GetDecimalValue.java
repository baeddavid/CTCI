class Solution {
    public int getDecimalValue(ListNode head) {
        int n = 0;
        ListNode current = head;
        while(current != null) {
            n++;
            current = current.next;
        }
        n--;
        int val = 0;
        while(head != null) {
            double c = Math.pow(2.0, n--);
            val += head.val == 1 ? c : 0;
            head = head.next;
        }
        return val;
    }
}
