class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        if(strs.length == 1) return strs[0];
        String x = strs[0];
          for(int i=0;i<x.length();i++){
             char ch = x.charAt(i);
             boolean flag = true;
             for(int j=1;j<strs.length;j++){
                if(i < strs[j].length()){
                if(ch != strs[j].charAt(i)) flag = false;
                }else{
                    flag = false;
                    break;
                }
             }
             if(flag) ans.append(x.charAt(i));
             else break;
        }
        return ans.toString();
    }
}