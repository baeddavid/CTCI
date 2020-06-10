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

	// Better optimized solutions
	boolean palindromePermutationOptimized(String string) {
		int countOdd = 0;
		int[] countCache = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c : string.toCharArray()) {
			int currentValue = getCharNumber(c);
			if(x != 1) {
				countCache[x]++;
				if(countCache[x] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}

	int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);

		if(a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
}