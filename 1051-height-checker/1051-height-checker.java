class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] nums = heights.clone();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != heights[i])count++;
        }
        return count;
    }
}