public class SearchEntryEqualToIndex {
    int SearchEntryEqualIndex(int[] A, int left, int right) {
        if(left <= right) {
            int m = (left + (right - left)) / 2;
            if(A[m] == m) {
                return m;
            } else if(A[m] > A[m] - m) {
                SearchEntryEqualIndex(A, left, m - 1);
            } else {
                SearchEntryEqualIndex(A, m + 1, right);
            }
        }
        return -1;
    }
}
