 public class AdvanceArray {
    public static boolean advanceArray(int[] array) {
        // We can keep track of how far we can go from the current postion in the array
        int maxDistance = array[0];
        for(int i = 1; i <= maxDistance && i < array.length; i++) {
            maxDistance = Math.max(maxDistance, array[i] + i);
            System.out.println("Current distance is: " + maxDistance);
        }
        return maxDistance >= array.length;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,2,3,1};
        System.out.println(advanceArray(arr));
    }
 }
