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

	// Solution without using extra data structure
	boolean uniqueCharacterTime(String string) {
		for(int i = 0; i < string.length; i++) {
			for(int j = i + 1; j < string.length; j++) {
				if(string.charAt(i) == string.charAt(j))
					return false;
			}
		}
		return true;
	}

	
}