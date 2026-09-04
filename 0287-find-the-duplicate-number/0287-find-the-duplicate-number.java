import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ans.put(nums[i], ans.getOrDefault(nums[i], 0) + 1);
        }
        int Dup = Collections.max(ans.values());
        for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}