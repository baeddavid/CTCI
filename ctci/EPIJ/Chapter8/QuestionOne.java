public class QuestionOne {
    public static int countSteps(int n) {
        int[] cache = new int[n + 1];
        cache[0] = 1;
        cache[1] = 1;
        cache[2] = 2;

        for(int i = 3; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2] + cache[i - 3];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        System.out.print(countSteps(5));
    }
}
