class Solution {
    public String longestCommonPrefix(String[] strings) {
        if(strings == null || strings.length == 0) { return ""; }
        return longestCommonPrefix(strings, 0, strings.length - 1);
    }

    private String longestCommonPrefix(String[] strings, int left, int right) {
        if(left == right) { return strings[left]; }
        int mid = (left + right) / 2;
        String leftLCP = longestCommonPrefix(strings, left , mid - 1);
        String rightLCP = longestCommonPrefix(strings, mid + 1, right);
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
}
