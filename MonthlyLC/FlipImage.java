public class FlipImage {
    public static int[][] flipAndInvertImage(int[][] A) {
        for(int row = 0; row < A.length; row++) {
            reverse(A[row]);
            flip(A[row]);
        }
        return A;
    }

    private static void flip(int[] A) {
        for(int i = 0; i < A.length; i++) {
            A[i] = A[i] ^ 1;
        }
    }
    
    private static void reverse(int[] A) {
        int i = 0, j = A.length - 1;
        while(i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    } 

    private static void print(int[][] A) {
        for(int[] row : A) {
            for(int num : row) {
                System.out.println(num + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int[][] A = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };

        A = flipAndInvertImage(A);
        print(A);
    }
}
