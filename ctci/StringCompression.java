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
}