public class StringCompression {
	String compressString(String str) {
		int count = 1;
		char key = str.charAt(0);
        String ans = "";
		for(int i = 1; i < str.length(); i++) {
            System.out.println(key);
			if(str.charAt(i) == key)
				count++;
			else {
				ans += String.valueOf(key);
				ans += String.valueOf(count);
				key = str.charAt(i);
				count = 1;
			}
		}
        ans += String.valueOf(key);
		ans += String.valueOf(count);
        
		return str.length() < ans.length() ? str : ans;
	}
}