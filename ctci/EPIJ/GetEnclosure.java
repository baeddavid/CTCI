public class GetEnclosure {
    // The private method to find the first instance of k
    private int firstK(int[] A, int l, int r, int k) {
        if(l <= r) {
            int m = l + (r - l) / 2;
            if(A[m] == k && (m == 0 || A[m] > A[m - 1])) {
                return m;
            }

            if(A[m] > k) {
                return firstK(A, l, m - 1, k);
            } else {
                return firstK(A, m + 1, r, k);
            }
        }
        return - 1;
    }

    // The private method to find the last instance of k
    private int lastK(int[] A, int l, int r, int k) {
        if(l <= r) {
            int m = l + (r - l) / 2;
            if(A[m] == k && (m == 0 || A[m + 1] > A[m])) {
                return m;
            }

            if(A[m] > k) {
                return lastK(A, l, m - 1, k);
            } else {
                return lastK(A, m + 1, r, k);
            }
        }
        return -1;
    }

    // The public method to retrieve the indices that enclose k
    public int[] getEnclosure(int[] A, int k) {
        int first = firstK(A, 0, A.length - 1, k);
        int last = lastK(A, 0, A.length - 1, k);

        if(first == -1 || last == -1) {
            return new int[] {-1, -1};
        } return new int[] {first, last};
    }
}
