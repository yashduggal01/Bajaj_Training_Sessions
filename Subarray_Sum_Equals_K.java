import java.util.*;

class Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // Important: prefix sum 0 occurs once initially
        
        for (int num : nums) {
            sum += num;
            // Check if (sum - k) exists in map
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            // Add current sum to map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
