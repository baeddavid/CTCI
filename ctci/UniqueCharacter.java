import java.util.HashSet;
import java.util.Arrays;

class UniqueCharacter {
	// Solution using additonal memory
	boolean uniqueCharacterMem(String string) {
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i < string.length(); i++) {
			if(set.contains(string.charAt(i))) 
				return false;
			set.add(string.charAt(i));
		}
		return true;
	}

	// Solution without using extra data structure
	boolean uniqueCharacterTime(String string) {
		for(int i = 0; i < string.length(); i++) {
			for(int j = i + 1; j < string.length(); j++) {
				if(string.charAt(i) == string.charAt(j))
					return false;
			}
		}
		return true;
	}

	// Solution using constant space
	boolean uniqueCharacterConst(String string) {
		string = string.toLowerCase();
		int[] charArray = new int[256];
		for(int i = 0; i < string.length(); i++) {
			charArray[string.charAt(i)]++;
			if(charArray[string.charAt(i)] > 1)
				return false;
		} 
		return true;
	}

	// Solution that uses sort
	boolean uniqueCharacterSort(String string) {
		char[] chars = string.toCharArray();
		Arrays.sort(chars);
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] == chars[i + 1])
				return false;
		} 
		return true;
	}
}