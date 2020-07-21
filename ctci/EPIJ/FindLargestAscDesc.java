public class FindLargestAscDesc {
    static int findLargest(int[] A, int left, int right) {
        if(left <= right) {
            int mid = left + (right - left) / 2;
            if(left == right || (A[mid] > A[mid + 1] && A[mid] > A[mid - 1])) {
                return A[mid];
            }

            if(mid != 0 && A[mid] < A[mid - 1]) {
                return findLargest(A, left, mid - 1);
            } else {
                return findLargest(A, mid + 1, right);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {378, 478, 550, 631, 368, 279, 234, 220, 203};
        System.out.print(findLargest(A, 0, A.length - 1));
    }
}
