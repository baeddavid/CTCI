public class PalindromePermutation {
	boolean palindromePermutation (String string) {
		int flag = -1;
		string = string.toLowerCase();

		int[] asciiCache = new int[128];

		for(int i = 0; i < string.length(); i++) {
			asciiCache[string.charAt(i)]++;
		}

		for(int counter : asciiCache) {
			if(counter % 2 == 1 ) {
				flag++;
				if(flag >= 1)
					return false;
			}
		}

		return true;
	}
}