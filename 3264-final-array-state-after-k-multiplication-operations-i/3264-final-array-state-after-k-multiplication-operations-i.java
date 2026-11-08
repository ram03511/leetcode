class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int small = Integer.MAX_VALUE;
            int pos = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] < small){small = nums[j];pos = j;}
            }
            nums[pos] = nums[pos]*multiplier;
        }
        return nums;
    }
}