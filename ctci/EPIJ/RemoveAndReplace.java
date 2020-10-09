public class RemoveAndReplace {
    // Consider the following two rules that are to be applied to an array of characters.
    // Replace each 'a' by two 'd's
    // Delete each entry containing a 'b'
    // [a, b, a, c, _]

    public static int removeAndReplace(char[] string, int length) {
        int writeIndex = 0, aCount = 0;
        // First remove all instances of 'b' from our char array
        for(int i = 0; i < length; i++) {
            if(string[i] == 'b') {
                string[writeIndex++] = string[i];
            }
            if(string[i] == 'a') {
                aCount++;
            }
        }

        // Get pointers for the array
        int currentIndex = writeIndex - 1;
        writeIndex = writeIndex + aCount - 1;
        int finalSize = writeindex - 1;

        while(curretntIndex >= 0) {
            if(string[currentIndex] == 'a') {
                string[writeIndex--] = 'd';
                string[writeIndex--] = 'd';
            } else {
                string[writeIndex--] = string[currentIndex];
            }
            currentIndex--;
        }
        return finalSize;
    }
}
