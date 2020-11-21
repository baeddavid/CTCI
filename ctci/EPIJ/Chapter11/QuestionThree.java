public class QuestionThree {
    public static int searchCyclicArray(int[] A int key) {
        int pivot = helper(A, 0, A.length - 1);
        if(pivot == -1) {
            return search(A, 0, A.length - 1, key);
        }

        if(A[pivot] == key) {
            return pivot;
        }

        if(A[0] <= key) {
            return search(A, 0, pivot - 1, key);
        } else {
            return search(A, pivot + 1, A.length - 1, key);
        }
    }

    private static int search(int[] A, int left, int right, int key) {
        if(left > right) { return -1; }
        int med = (left + right) / 2;
        if(A[med] == key) { return med; }
        else if(A[med] > key) { return search(A, left, med - 1, key); }
        else { return search(A, med + 1, right, key); }
    }

    private static int helper(int[] A, int left int right) {
        if(right < left) { return -1; }
        if(right == left) { return left; }
        int mid = (left + right) / 2;

        if(mid < right && A[mid] > A[mid + 1]) {
            return mid;
        }
        if(mid > low && A[mid] < A[mid - 1]) {
            return mid - 1;
        }
        if(A[low] >= A[mid]) {
            return helper(A, low, mid - 1);
        } else {
            return helper(A, mid + 1, right);
        }
    }
}
