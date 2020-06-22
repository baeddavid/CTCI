public class DeleteDuplicatesArray {
    public static void main(String[] args) {
	int[] A = new int[] {2,2,3,3,5,5,6,6,11,11,11,11,13,13};
	int delete = deleteElementsOptimal(A);
	for(int num : A) {
	    System.out.print(num + " ");
	}
    }

    // Optimal Solution
    public static int deleteElementsOptimal(int[] A) {
	int writePointer = 1;
	for(int i = 1; i < A.length; i++) {
	    if(A[writePointer - 1] != A[i])
		A[writePointer++] = A[i];
	}
	return writePointer + 1;
    }
}
    
