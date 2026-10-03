class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] arr = new int[2];
        int count1 = 0;
        int count2 = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
           map.put(nums1[i],map.getOrDefault(nums1[i],0)+1); 
        }
        for(int i=0;i<nums2.length;i++){
            map1.put(nums2[i],map1.getOrDefault(nums2[i],0)+1); 
        }
        for(int val: map.keySet()){
            if(map1.containsKey(val)){
                count1 += map.get(val);
            }
        }
        for(int val: map1.keySet()){
            if(map.containsKey(val)){
                count2 += map1.get(val);
            }
        }
        arr[0] = count1;
        arr[1] = count2;
        return arr;
    }
}