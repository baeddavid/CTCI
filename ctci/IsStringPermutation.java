import java.util.Arrays;

public class IsStringPermutation {
	// Sorts both strings to compare them
	boolean isStringPermutationSort(String s1, String s2) {
		char[] charS1 = s1.toCharArray();
		char[] charS2 = s2.toCharArray();

		Arrays.sort(charS1);
		Arrays.sort(charS2);

		return Arrays.equals(charS1, charS2);	
	}

	// Creates an additional data structure to cache the ASCII code. Linear time and constant space soltuion.
	boolean isStringPermutationCache(String s1, String s2) {
		// Convert both strings to lowercase, since it was not specified.
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		int[] ascii = new int[128];

		for(int i = 0; i < s1.length(); i++) {
			ascii[s1.charAt(i)]++;
		}

		for(int j = 0; j < s2.length(); j++) {
			ascii[s2.charAt(j)]--;
		}

		for(int c : ascii) {
			if(c != 0)
				return false;
		}

		return true;
	}
}