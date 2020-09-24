import java.util.Arrays;

public class ApplyPermutation {
    public static void applyPermutation(int[] permutation, char[] array) {
        for(int i = 0; i < array.length; i++) {
            if(i != permutation[i]) {
                swap(array, i, permutation[i]);
                swap(permutation, i, permutation[i]);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void swap(char[] chars, int a, int b) {
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }

    public static void main(String[] args) {
        int[] perm = new int[] {2, 0, 1, 3};
        char[] chars = new char[] {'a','b','c','d'};

        applyPermutation(perm, chars);
        System.out.println(Arrays.toString(chars));
    }
}
