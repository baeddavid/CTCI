public class SearchRotatedArray {
    private int binarySearch(int[] A, int left, int right, int key) {
        int mid = (right + left) / 2;
        if(A[mid] == key) {
            return mid;
        } else if(A[mid] > key) {
            return binarySearch(A, left, mid - 1, key);
        } else {
            return binarySearch(A, mid + 1, right, key);
        }
    }

    private int findPivot(int[] A, int left, int right) {
        if(left == right) {
            return A[left];
        }
        int mid = (right + left) / 2;
        if(A[mid] > A[mid + 1]) {
            return mid;
        } else if(A[mid - 1] > A[mid]) {
            retun mid - 1;
        }
        if(A[mid] > A[right]) {
            return findPivot(A, mid + 1, r);
        } else {
            return findPivot(A, left, mid - 1);
        }
    }

    public int rotateBinarySearch(int[] A, int x) {
        int pivot = findPivot(A, 0, A.length - 1);
        if(A[pivot] == x) {
            return pivot;
        }
        if(A[0] <= x) {
            return binarySearch(A, 0, pivot - 1, x);
        } else {
            return binarySearch(A, pivot, A.length - 1, x);
        }
    }
}
