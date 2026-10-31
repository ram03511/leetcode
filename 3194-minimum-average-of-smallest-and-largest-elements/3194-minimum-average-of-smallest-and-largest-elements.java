class Solution {
    public double minimumAverage(int[] nums) {
        double min = 60.0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            double x = (nums[i] + nums[(nums.length-1)-i])/2.0;
            if(x < min)min = x;
        }
        return min;
    }
}