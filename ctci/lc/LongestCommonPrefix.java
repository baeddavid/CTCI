class Solution {
    public String longestCommonPrefix(String[] strings) {
        if(strings == null || strings.length == 0) { return ""; }
        return longestCommonPrefix(strings, 0, strings.length - 1);
    }

    private String longestCommonPrefix(String[] strings, int left, int right) {
        if(left == right) { return strings[left]; }
        int mid = (left + right) / 2;
        String leftLCP = longestCommonPrefix(strings, left , mid - 1);
        String rightLCP = longestCommonPrefix(strings, mid, right);
        return lcpHelper(leftLCP, rightLCP);
    }

    private String lcpHelper(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for(int i = 0; i < min; i++) {
            if(left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return right.substring(0, min);
    }

    // Horizontal Scanning Solution
    public String longestCommonPrefix(String[] strings) {
        if(strings.length == 0) { return ""; }
        String prefix = strings[0];
        for(int i = 1; i < strings.length; i++) {
            while(strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
