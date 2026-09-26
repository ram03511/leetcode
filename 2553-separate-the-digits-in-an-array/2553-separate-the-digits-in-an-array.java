class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> ans = new ArrayList<>();
            int n = nums[i];
            while (n > 0) {
                int x = n % 10;
                ans.add(x);
                n /= 10;
            }
           Collections.reverse(ans);
           res.addAll(ans);
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}