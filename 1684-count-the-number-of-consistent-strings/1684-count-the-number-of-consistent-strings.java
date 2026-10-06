class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            char ch = allowed.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(String s : words){
            boolean flag = false;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(map.containsKey(ch)) flag = true;
                else{flag = false;break;}
            }
            if(flag)count++;
        }
        return count;
    }
}