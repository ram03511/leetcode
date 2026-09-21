class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int[] match : matches){
            int loser = match[1];
            int winner = match[0];
            set.add(winner);
            map.put(loser,map.getOrDefault(loser,0)+1);
        }
        List<Integer> ans1 = new ArrayList<>();
        for(int val : set){
            if(!map.containsKey(val)){
                ans1.add(val);
            }
        }
        List<Integer> ans2 = new ArrayList<>();
        for(int val: map.keySet()){
            if(map.get(val) == 1){
                ans2.add(val);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        Collections.sort(ans1);
        Collections.sort(ans2);
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}