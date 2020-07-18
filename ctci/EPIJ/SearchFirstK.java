public class SearchFirstK {
    // Brute force linear time solution
    int SearchFirstKBrute(int[] A, int k) {
        for(int i = 0; i < A.length; i++) {
            if(A[i] == k) {
                return i;
            }
        }
        return -1;
    }

    // Optimal recursive solution
    int SearchFirstK(int[] A, int l, int r, int k) {
        if(l <= r) {
            int m = l + (r - l) / 2;
            if(A[m] == k && (m == 0 || A[m] > A[m + 1])) {
                return m;
            }

            if(A[m] > k) {
                return FirstK(A, l, m - 1, k);
            } else {
                return FirstK(A, m + 1, r, k);
            }
        }
        return -1;
    }
}
