class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder x = new StringBuilder(s);
        for(int i=0;i<indices.length;i++){
            x.setCharAt(indices[i],s.charAt(i));
        }
        return x.toString();
    }
}