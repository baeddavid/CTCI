public class NextGreaterElement {
    public void NextGreaterElement(int[] A) {
        for(int i = 0; i < A.length; i++) {
            int next = -1;
            for(int j = i + 1; j < A.length; j++) {
                if(A[i] < A[j]) {
                    next = A[j];
                    break;
                }
            }
            System.out.print(A[i] + "-->" + next);
        }
    }
}
