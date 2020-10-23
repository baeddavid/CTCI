// Implement a method to perform basic string compression using the counts of repeated characters. For example, the string "aabcccccaaa" would become "a2b1c5a3".
// If the compressed string would not become smaller than the original string, your method should return the original string. You can assume the string has
// only uppercase and lowercase letters(a-z).

public class QuestionSix {
    // We need two loops to keep track of continuous letters
    public static String stringCompression(String string) {
        StringBuilder sb = new StringBuilder();
        // Outer loop to iterate through the string
        int currentIdx = 0;
        while(currentIdx < string.length()) {
            char currentChar = string.charAt(currentIdx);
            int count = 0;
            int nextChar = currentIdx;
            while(nextChar < string.length() && string.charAt(currentIdx) == string.charAt(nextChar)) {
                count++;
                nextChar++;
            }
            currentIdx = nextChar;
            sb.append(currentChar);
            sb.append(count);
        }
        return sb.length() > string.length() ? string : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
    }
}
