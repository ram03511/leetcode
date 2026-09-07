class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int count = 1;
        if(nums.length == 1) return 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}