import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int currentSum = nums[0] + nums[1] + nums[nums.length - 1];
        int currentMin = Math.abs(currentSum - target);

        for(int i = 0; i < nums.length - 2; i++) {
            int p1 = i + 1, p2 = nums.length - 1;
            while(p1 < p2) {
                int sum = nums[i] + nums[p1] + nums[p2];

                if(Math.abs(sum - target) < currentMin) {
                    currentMin = Math.abs(sum - target);
                    currentSum = sum;
                }
                if(sum < target) {
                    p1++;
                } else {
                    p2--;
                }
            }
        }
        return currentSum;
    }
}
