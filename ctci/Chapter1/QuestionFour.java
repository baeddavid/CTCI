// Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards.
// A permutation is a rearrangment of letters. The palindrome does not

public class QuestionFour {
    // Again the question is somewhat ambiguously phrased. Due to not having a lot of information regarding the input type of the string
    // we must eliminate all whitespace and convert the string to a consistent casing.
    public static boolean palindromePermutation(String string) {
        string = string.toLowerCase();
        // We don't need to check for whitespaces actually. We can just skip if it is a white space.
        int[] ascii = new int[128];

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ') {
                ascii[string.charAt(i)]++;
            }
        }

        boolean oddCountFound = false;
        for(int count : ascii) {
            if(count % 2 == 1) {
                if(oddCountFound) {
                    return false;
                }
                oddCountFound = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       System.out.println(palindromePermutation("Tact Coaa"));
    }
}
