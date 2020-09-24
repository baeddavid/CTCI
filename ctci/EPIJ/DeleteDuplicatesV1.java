import java.util.Arrays;

class DeleteDuplicatesV1 {
    public static int removeKey(int[] arr, int key) {
        int writeIndex = 0, keyNum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) { keyNum++; }
            if(arr[i] != key) { arr[writeIndex++] = arr[i]; }
        }
        return arr.length - keyNum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,2,3,4,2,1,1,2,3,1,5};
        System.out.println(removeKey(arr, 2));
    }
}
