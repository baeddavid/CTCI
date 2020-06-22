import java.lang.StringBuilder;

public class intToString {
    public static String IntToString(int number) {
	boolean isNegative = number < 0 ? true : false;
	StringBuilder sb = new StringBuilder();

	while(number != 0) {
	    sb.append((char)('0' +  Math.abs(number % 10)));
	    number /= 10;
	}

	return sb.append(isNegative ? "-" : "").reverse().toString();
    }

    public static void main(String[] args) {
	System.out.print((char)'0' + 4);
    }
}
