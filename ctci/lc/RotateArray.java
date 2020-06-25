public class RotateArray {
    public static void rotateArray(int[] A, int k) {
        while(k-- > 0){
            int temp = A[A.length - 1];
            int start = A[0], prev = 0;

            for(int i = 0; i < A.length - 1; i++) {
                prev = A[i + 1];
                A[i + 1] = start;
                start = prev;
            }

            A[0] = temp;
        }
    }

    public static void rotateArrayElegant(int[] A, int k) {
        k = k % A.length;
        int count = 0;

        for(int i = 0; count < A.length; i++) {
            int current = i;
            int prev = A[i];
            do {
                int next = (current + k) % A.length;
                int temp = A[next];
                A[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while(i != current);
        }
    }

        public static void main(String[] args) {
            int[] A = new int[] {1,2,3,4,5};
            rotateArray(A, 2);
            for(int x : A)
                System.out.print(x + " ");
        }
}
