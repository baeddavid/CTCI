public class StringCompression {
	// Solution using SB
	String compressString(String str) {
		StringBuffer sb = new StringBuffer();
		sb.append("");

		int count = 1;
		char key = str.charAt(0);
		for(int i = 1; i < str.length(); i++) {
            System.out.println(key);
			if(str.charAt(i) == key)
				count++;
			else {
				sb.append(String.valueOf(key));
				sb.append(String.valueOf(count));
				key = str.charAt(i);
				count = 1;
			}
		}
		sb.append(String.valueOf(key));
		sb.append(String.valueOf(count));
        String ans = sb.toString();
        
		return str.length() < ans.length() ? str : ans;
	}

	// Optimized Solution
	String compressStringOptimize(String str) {
		int finalLength = countCompression(str);
		if(finalLength >= str.length()) return str;

		StringBuilder compressed = new StringBuilder(finalLength);
		int countConsecutive = 0;
		for(int i = 0; i < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.toString();
	}

	int countCompression(String str) {
		int compressedLength = 0;
		int countConsecutive = 0;
		for(int i = 0; i < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive = 0;
			}
		}
		return compressedLength;
	}
}