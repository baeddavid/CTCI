import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PermutationsII {
    public ArrayList<String> printPerms(String s) {
        ArrayList<String> result = new ArrayList<>();
        HashMap<Character, Integer> map = buildFreqTable(s);
        print(map, "", s.length(), result);
        return result;
    }

    public HashMap<Character, Integer> buildFreqTable(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        return map;
    }

    public void printPerms(HashMap<Character, Integer> map, String prefix, int remainder, ArrayList<String> result) {
        if(remaining == 0) {
            result.add(prefix);
            return;
        }
        for(Character c : map.keySet()) {
            int count = map.get(c);
            if(count > 0) {
                map.put(c, count - 1);
                printPerms(map, prefix + c, remaining - 1, result);
                map.put(c, count);
            }
        }
    }
}
