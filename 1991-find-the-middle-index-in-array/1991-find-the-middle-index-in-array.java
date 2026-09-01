class Solution {
    public int findMiddleIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int prefix = 0;
            int postfix = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j < i) {
                    prefix += nums[j];
                } else if (j > i) {
                    postfix += nums[j];
                }
            }
           if(postfix == prefix){
             return i;
           }
        }
        return -1;
    }
}