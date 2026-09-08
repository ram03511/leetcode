class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int n = nums[i];
            while(n > 0){
                int x = n%10;
                sum += x;
                n /= 10;
            }
            if(sum < min){
                min = sum;
            }
        }
        return min;
    }
}