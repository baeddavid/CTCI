import java.util.Arrays;

public class ValidAnagram {
    public boolean validAnagramSort(String s, String t) {
       char[] S = s.toCharArray();
       char[] T = t.toCharArray();
       Arrays.sort(S);
       Arrays.sort(T);
       return Arrays.equals(S, T);
    }
}
