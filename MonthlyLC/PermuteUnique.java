class Solution {
    public HashMap<Integer, Integer> buildFreqTable(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }

    public void createPermutations(HashMap<Integer, Integer> map, List<Integer> prefix, int remaining, List<List<Integer>> result) {
        if(remaining == 0) {
            result.add(deepCopy(prefix));
            prefix.remove(prefix.size() - 1);
            return;
        }
        for(Integer num : map.keySet()) {
            int count = map.get(num);
            if(count > 0) {
                map.put(num, count - 1);
                prefix.add(num);
                createPermutations(map, prefix, remaining - 1, result);
                map.put(num, count);
            }
        }
        if(prefix.size() > 0) { 
            prefix.remove(prefix.size() - 1);
        }
    }
    
    public List<Integer> deepCopy(List<Integer> a) {
        List<Integer> result = new ArrayList<>();
        for(Integer num : a) {
            result.add(num);
        }
        return result;
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = buildFreqTable(nums);
        createPermutations(map, new ArrayList<Integer>(), nums.length, result);
        return result;
    }
}
