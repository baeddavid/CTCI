import java.util.ArrayList;

public class QuestionFour {
    static ArrayList<String> perms = new ArrayList<String>();
    public static ArrayList<String> getPerms(String str) {
        if(str == null) { return null; }

        ArrayList<String> permutations = new ArrayList<String>();
        if(str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char first = str.charAt(0);
        String remainder = str.substring(1);
        ArrayList<String> words = getPerms(remainder);
        for(String word: words) {
            for(int j = 0; j <= word.length(); j++) {
                String s = insertCharAt(word, first, j);
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
        if(left == right) { perms.add(str); }
        for(int i = left; i <= right; i++) {
            str = swap(str, left, i);
            bruteForce(str, left + 1, right);
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
