public class BitonicArray {
    private static int getPivot(int[] A, int left, int right) {
        if(left == right) {
            return left;
        }

        int mid = left + (right  - left) / 2;
        if(A[mid] > A[0]) {
            return getPivot(A, mid + 1, right);
        } return getPivot(A, left, mid - 1);
    }

    private static int BS(int[] A, int left, int right, int k) {
        if(left <= right) {
            int mid = left + (right - left) / 2;
            if(A[mid] == k) {
                return mid;
            } else if(A[mid] > k) {
                return BS(A, left, mid - 1, k);
            } return BS(A, mid + 1, right, k);
        }
        return -1;
    }

    private static int RBS(int[] A, int left, int right, int k) {
        if(left <= right) {
            int mid = left + (right - left) / 2;
            if(A[mid] == k) {
                return mid;
            } else if(A[mid] > k) {
                return RBS(A, mid + 1, right, k);
            } return RBS(A, left , mid - 1, k);
        }
        return -1;
    }

    public static int searchBitonic(int[] A, int k) {
        int pivot = getPivot(A, 0, A.length - 1);
        if(A[pivot] == k) {
            return pivot;
        }

        return A[pivot] < k ? BS(A, 0, pivot - 1, k) : RBS(A, pivot + 1, A.length - 1, k);
    }

    public static void main(String[] args) {
        int[] A = {6,7,5,4,3,2,1};
        System.out.print(searchBitonic(A, 2));
    }
}
