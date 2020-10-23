// There are three types of edits that can be performed on strings:
// insert a character
// remove a character
// replace a character
// Given two strings, write a fucntion to check if they are one edit (or zero edits) away.

class QuestionFive {
    public static oneEditAway(String s1, String s2) {
        if(s1.length() == s2.length()) {
            return oneEditReplace(s1, s2);
        } else if(s1.length() + 1 == s2.length()) {
            return isCharacterInserted(s1, s2);
        } else if(s1.length() == s2.length() + 1) {
            return isCharacterInserted(s2, s1);
        }
        return false;
    }

    private static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    // We can check if a character was inserted
    private static boolean isCharacterInserted(String s1, String s2) {
        int s1Index = 0, s2Index = 0;
        while(s1Index < s1.length() && s2Index < s2.length()) {
            if(s1.charAt(s1Index) != s2.charAt(s2Index)) {
                if(s1Index != s2Index) {
                    return false;
                }
                s2Index++;
            } else {
                s1Index++;
                s2Index++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isCharacterInserted("pe", "pale"));

    }
}
