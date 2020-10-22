import java.util.Arrays;

// Given two strings write a method to decide if one is a permutation of the other
public class QuestionTwo {
    // The question again is a bit ambiguous. We have no indication whether the strings are capitalized, have punctuation or white space.
    // The safe method here would be to convert both strings to a common rule.
    public static boolean checkPermutationSort(String s1, String s2) {
        char[] string1 = s1.toLowerCase().toCharArray();
        char[] string2 = s2.toLowerCase().toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);
    }

    public static boolean checkPermutationCharacterCount(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] chars = new int[128];

        for(int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i)]++;
        }

        for(int i = 0; i < s2.length(); i++) {
            chars[s1.charAt(i)]--;
        }

        for(int count : chars) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPermutationCharacterCount("This is a test to see if it works", "works This is a test to see if it"));
    }
}
