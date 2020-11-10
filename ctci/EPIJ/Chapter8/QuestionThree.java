public class QuestionThree {
    public static int magicIndex(int[] A, int left, int right) {
        if(left > right) { return -1; }
        int med = (left + right) / 2;

        if(A[med] == med) { return med; }
        else if(A[med] < med) { return magicIndex(A, med + 1, right); }
        else { return magicIndex(A, left, med - 1); }
    }

    public static int bruteForce(int[] A) {
        for(int i = 0; i < A.length; i++) {
            if(A[i] == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = new int[] { -7, -3, 1, 3, 7, 12 };
        System.out.println(magicIndex(A, 0, A.length));
    }
}
