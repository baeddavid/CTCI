public class QuestionOne {
    public static int search(int[] A, int k) {
        return helper(A, k, 0, A.length - 1);
    }

    private static int helper(int[] A, int k, int left, int right) {
        if(left > right) {
            return -1;
        }
        int med = (left + right) / 2;
        if(A[med] == k && A[med] != A[med - 1]) {
            return med;
        } else if(A[med] >= k) {
            return helper(A, k, left, med - 1);
        } else {
            return helper(A, k, med + 1, right);
        }
    }
    
    public static void main(String[] args) {
        int[] A = new int[] { -14, -10, 2, 108, 108, 243, 285, 285, 285, 401 };
        System.out.println(search(A, 285));
    }
}
