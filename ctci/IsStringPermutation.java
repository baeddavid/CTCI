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
	
}