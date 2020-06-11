public class OneAway {
	boolean oneAwayCheck(String str1, String str2) {
		if(Math.abs(str1.length() - str2.length()) > 1) return false;
		int count = 0;
		for(int i = 0; i < str1.length(); i++) {
			if(!str1.charAt(i).equals(str2.chartAt(i)))
				count++;
			if(count > 1)
				return false;
		}
		return true;
	}
}