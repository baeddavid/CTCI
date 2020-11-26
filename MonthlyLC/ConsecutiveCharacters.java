class Solution {
    public int maxPower(String s) {
        int currentCount = 1, power = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                currentCount++;
            } else {
                power = Math.max(power, currentCount);
                currentCount = 1;
            }
        }
        power = Math.max(power, currentCount);
        return power;
    }
}
