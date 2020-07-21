public class RunningSum {
    int[] runningSum(int[] A) {
        int[] answer = new int[A.length];
        answer[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            answer[i] = A[i] + answer[i - 1];
        }
        return answer;
    }
}
