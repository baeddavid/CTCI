public class QuestionTwo {
    public static int index(int[] A, int left, int right) {
        if(left > right) {
            return -1;
        }
        int med = (left + right) / 2;
        if(A[med] == med) {
            return med;
        } else if(A[med] > med) {
            return index(A, left, med - 1);
        } else {
            return index(A, med + 1, right);
        }
    }

    public static int brute(int[] A) {
        for(int i = 0; i < A.length; i++) {
            if(A[i] == i) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] A = new int[] { -4, -2, 0, 3, 5 };
        System.out.print(index(A, 0, A.length - 1));
    }
}
