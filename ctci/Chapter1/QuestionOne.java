import java.util.Set;
import java.util.HashSet;

// The wording of the question is somewhat ambiguous. If the string does not have any capitalizations then we can treat the string as is.
// However if we are expectd to treat capitalized and uncapitalized characters the same we need to perform some operation that convers the string to a constant case.

public class QuestionOne {
    public static boolean isUniqueSet(String string) {
        string = string.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < string.length(); i++) {
            if(set.contains(string.charAt(i))) {
                return false;
            }
            set.add(string.charAt(i));
        }
        return true;
    }

    // Constant space if the string is ascii based
    public static boolean isUniqueArray(String string) {
        char[] cache = new char[128];
        string = string.toLowerCase();

        for(int i = 0; i < string.length(); i++) {
            if(cache[string.charAt(i)] != 0) {
                return false;
            }
            cache[string.charAt(i)]++;
        }
        return true;
    }

    // The extra part of the question where they ask if we can do this without additonal datastructures is an interesting question.
    // We can always trade the time complexity for space complexity by having a polynomial time solution in exchange for a constant space solution.

    public static boolean isUniqueConstantSpace(String string) {
        string = string.toLowerCase();
        for(int i = 0; i < string.length(); i++) {
            for(int j = i + 1; j < string.length(); j++) {
                if(string.charAt(i) == string.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueConstantSpace("davi"));
    }
}
