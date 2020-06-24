public class ApplyPermutation {
    public static int[] applyPermutationLinSpace(int[] A, int[] P) {
        int[] B = new int[A.length];
        int aIndex = 0;

        for(int i = 0; i < P.length; i++) {
            B[P[i]] = A[aIndex++];
        }

        return B;
    }

    // Optimized Solution
    public static int[] applyPermutation(int[] A, int[] P) {
        for(int i = 0; i < P.length; i++) {
            if(i != P[i]) {
                swap(A, i, P[i]);
                swap(P, i, P[i]);
            }
        }
        return A;
    }

    private static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    public static void main(String[] args) {
        int[] A = new int[] {1, 2, 3, 4};
        int[] P = new int[] {2, 0, 1, 3};

        int[] C = applyPermutation(A, P);
        for(int x : C)
            System.out.print(x + " ");
    }
}
