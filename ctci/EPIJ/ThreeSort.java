public class ThreeSort {
    public static void threeSort(int[] nums, int pivot) {
        int partition = nums[pivot], writeIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < partition) {
                swap(nums, writeIndex++, i);
            }
        }
        int backWriteIndex = nums.length - 1;
        for(int i = nums.length - 1; i >= writeIndex; i--) {
            if(nums[i] > partition) {
                swap(nums, backWriteIndex--, i);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0,1,2,0,2,1,1};
        threeSort(arr, 1);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
