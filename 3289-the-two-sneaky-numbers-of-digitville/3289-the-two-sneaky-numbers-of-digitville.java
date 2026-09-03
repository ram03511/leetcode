class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int x =0;
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    ans[x] = nums[i];
                    if(x <= 1){
                        x++;
                    }
                }
            }
        }
        return ans;
    }
}