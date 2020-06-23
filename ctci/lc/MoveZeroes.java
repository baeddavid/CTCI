public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] != 0) {
                A[writeIndex++] = A[i];
            }
        }

        for(int j = writeIndex; j < A.length; j++) {
            A[j] = 0;
        }
    }
}
