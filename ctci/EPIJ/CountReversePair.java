class Solution {
    public int countReversePair(int[] A) {
        return mergeSort(A, 0, A.length - 1);
    }

    private int mergeSort(int[] A, int left, int right) {
        int count = 0;
        if(left < right) {
            int m = (right - left) + left / 2;
            count += mergeSort(A, left, m);
            count += mergeSort(A, m + 1, right);
            count += merge(A, left, m, right);
        }
    }

    private int merge(int[] A, int left, int med, int right) {
        int[] leftArray = Arrays.copyOfRange(A, left , med + 1);
        int[] rightArray = Arrays.copyOfRange(A, med + 1, right + 1);

        int i = 0, j = 0, k = l, count = 0;
        while(i < left.length && j < right.length) {
            if(leftArray[i] <= rightArray[j]) {
                A[k++] = A[i++];
            } else {
                A[k++] = A[j++];
                count += (m + 1) - (left + i);
            }
        }

        while(i < leftArray.length)
            A[k++] = leftArray[i++];

        while(j < rightArray.length)
            A[k++] = rightArray[j++];

        return count;
    }
}
