public class generatePermutations {
    public static void main(String[] args) {
        int[] A = new int[] {1, 2, 3};
        permute(A, 0, 2);
    }

    public static void permute(int[] A, int left, int right) {
        if(left == right)
            print(A);

        for(int i = left; i <= right; i++) {
            swap(A, left, i);
            permute(A, left + 1, right);
            swap(A, left, i);
        }
    }

    private static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    private static void print(int[] A) {
        System.out.print("{");
        for(int num : A) {
            System.out.print(num + " ");
        }
        System.out.print("}");
    }
}
