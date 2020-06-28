import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean validAnagramSort(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        return Arrays.equals(S, T);
    }

    public boolean validAnagramMap(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap <Character, Integer> M = new HashMap <>();
        for(int i = 0; i < s.length(); i++) {
            if(M.containsKey(s.charAt(i)))
                M.put(s.charAt(i), M.get(s.charAt(i)) + 1);
            else
                M.put(s.charAt(i), 1);
        }

        for(int j = 0; j < t.length(); j++) {
            if(M.containsKey(t.charAt(j))) {
                M.put(t.charAt(j), M.get(t.charAt(j)) - 1);
                if(M.get(t.charAt(j)) < 0)
                    return false;
            }
            else
                return false;
        }

        for(int k = 0; j < t.length(); k++) {
            if(M.get(t.charAt(k) != 0)
               return false;
               }
            return true;
        }
    }

}
