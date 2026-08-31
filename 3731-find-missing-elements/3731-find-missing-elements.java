class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        ;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        for (int j = min; j < max; j++) {
            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                if (j == nums[i]){
                    found = true;
                    break;
                } 
            }
            if(!found){
                ans.add(j);
            }
        }
        return ans;
    }
}