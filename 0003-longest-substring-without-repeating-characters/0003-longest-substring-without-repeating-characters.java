class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max  = 0;
        for(int i=0;i<s.length();i++){
            int count = 0;
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<s.length();j++){
              char ch = s.charAt(j);
              if(sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
                count++;
              }else{
                break;
              }
            }
            if(max < count)max = count;
        } 
        return max;
    }
}