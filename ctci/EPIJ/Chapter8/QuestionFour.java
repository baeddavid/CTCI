import java.util.ArrayList;

public class QuestionFour {
    public static ArrayList<String> getPerms(String str) {
        if(str == null) { return null; }

        ArrayList<String> permutations = new ArrayList<String>();
        if(str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        // Get the first character to permute
        char first = str.charAt(0);
        // Get the rest of the string minus the character we are using
        String remainder = str.substring(1);
        // Recursively permute the remainder of the string we have 
        ArrayList<String> words = getPerms(remainder);
        // Iterate through all the completed permutations of remainder
        for(String word: words) {
            // Iterate through the string
            for(int j = 0; j <= word.length(); j++) {
                // Insert the character we have stored at all possible indices
                String s = insertCharAt(word, first, j);
                // Add the completed permutation to the list
                permutations.add(s);
            }
        }
        return permutations;
    }

    private static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }

    public static ArrayList<String> bruteForce(String str, int left, int right) {
        ArrayList<String> perms = new ArrayList<String>();
        return helper(str, perms, left, right);
    }
    
    public static ArrayList<String> helper(String str, ArrayList<String> perms, int left, int right) {
        if(left == right) { perms.add(str); }
        for(int i = left; i <= right; i++) {
            str = swap(str, left, i);
            helper(str, perms, left + 1, right);
            str = swap(str, left, i);
        }
        return perms;
    }

    private static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray(); 
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
    
    public static void main(String[] args) {
        String str = "ABC";
        ArrayList<String> perm = bruteForce(str, 0, str.length() - 1);
        System.out.println(perm.size());
        for(String words : perm) {
            System.out.println(words);
        }
    }
}
