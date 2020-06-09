import java.util.HashSet;

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
}