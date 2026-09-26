class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s = new StringBuilder();
        StringBuilder x = new StringBuilder();
        for(int i=0;i<word1.length;i++){
           s.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
           x.append(word2[i]);
        }
        return s.toString().equals(x.toString());
    }
}