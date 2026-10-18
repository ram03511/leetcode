class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new  HashMap<>();
        if(nums.length == 0) return nums[0];
        for(int i=0;i<nums.length;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int val : map.keySet()){
            if(map.get(val) == 1)return val;
        }
        return 0;
    }
}