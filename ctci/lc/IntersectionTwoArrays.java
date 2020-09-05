import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class IntersectionTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
                continue;
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,2,3,1,2,3};
        int[] nums2 = new int[] {2,2,3,4,3,3,3};
        int[] nums = intersect(nums1, nums2);
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
