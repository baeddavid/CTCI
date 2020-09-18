public class CountAndSay {
    // Generate the nth term of the count and say sequence
    public static String countAndSay(int n) {
        String s = "1";
        for(int i = 1; i <= n; i++) {
            s = countIdx(s);
        }
        return s;
    }

    private static String countIdx(String s) {
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
            } else {
                sb.append(count);
                sb.append(c);
                count = 1;
                c = s.charAt(i);
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print(countAndSay(5));
    }
}
