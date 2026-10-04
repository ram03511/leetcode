class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       int count = 0;
       boolean mid = false;
       for(int i=0;i<s.length();i++){
         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }
       for(char ch : map.keySet()){
          if(map.get(ch) % 2 == 0)count += map.get(ch);
          else{ 
            count += map.get(ch)-1;
            mid = true;
          }
       }
       if(mid) count++;
       return count;
    }
}