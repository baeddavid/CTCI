public class GenerateMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];

        int leftRight = 0;
        int bottomTop = 0;
        int topBottom = n - 1;
        int rightLeft = n - 1;

        int index = 1;
        while(index <= n * n) {
            // Filling left to right
            for(int i = 0; i < n; i++) {
                if(spiral[leftRight][i] == 0) {
                    spiral[leftRight][i] = index++;
                }
            }
            leftRight++;

            // Filling top to bottom
            for(int j = 0; j < n; j++) {
                if(spiral[j][topBottom] == 0) {
                    spiral[j][topBottom] = index++;
                }
            }
            topBottom--;

            
            // Filling right to left

            for(int k = n - 1; k >= 0; k--) {
                if(spiral[rightLeft][k] == 0) {
                    spiral[rightLeft][k] = index++;
                }
            }
            rightLeft--;
            // Filling bottom to top

            for(int l = n - 1; l >= 0; l--) {
                if(spiral[l][bottomTop] == 0) {
                    spiral[l][bottomTop] = index++;
                }
            } 
            bottomTop++;
        }
        return spiral;
    }

    private static void print(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int[][] spiral = generateMatrix(5);
        print(spiral);
    }
}
