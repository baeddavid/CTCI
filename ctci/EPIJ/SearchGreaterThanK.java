public class SearchGreaterThanK {
    public static int searchGreaterThanK(int[] A, int l, int r, int k) {
        if(l <= r) {
            int m = l + (r - l) / 2;
            if(l == r) {
                return A[m];
            }
            if(A[m] == k || A[m] < k) {
                return searchGreaterThanK(A, m + 1, r, k);
            } else {
                return searchGreaterThanK(A, l, m - 1, k);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {-2,0,2,2,3,4,5};
        System.out.print(searchGreaterThanK(A, 0, A.length - 1, 2));
    }
}
