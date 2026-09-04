class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        String[] ans = new String[names.length];
        for (int i = 0; i < heights.length; i++) {
            int max = Collections.max(map.keySet());
            ans[i] = map.get(max);
            map.remove(max);
        }
        return ans;
    }
}