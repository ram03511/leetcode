class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           int left = 0;
           int right = nums.length-1;
           boolean lefts = true;
           boolean rights = true;
           while(left < i){
              if(nums[left] >= nums[i]){lefts = false;break;}
              left++;
           }
            while(right > i){
              if(nums[right] >= nums[i]){rights = false;break;}
              right--;
           }
           if(rights||lefts)ans.add(nums[i]);
        }
        return ans;
    }
}