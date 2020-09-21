import java.util.Scanner;

public class OneAway {
	public static boolean oneAway(String s1, String s2) {
		if(s1.length() == s2.length()) {
			return oneEditReplace(s1, s2);
		} else if(s1.length() + 1 == s2.length()) {
			return oneEditInsert(s1, s2);
		} else if(s1.length() == s2.length() + 1) {
			return oneEditInsert(s2, s1);
		}
		return false;
	}

	private static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(foundDifference) { return false; }
			}
			foundDifference = true;
		}
		return true;
	}

	private static boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while(index2 < s2.length() && index1 < s1.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String a, b;
		Scanner s = new Scanner(System.in);
		a = s.nextLine();
		b = s.nextLine();
		System.out.println(oneAway(a, b));
	}
}
